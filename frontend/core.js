    var tag = document.createElement('script');

    tag.src = "https://www.youtube.com/iframe_api";
    var firstScriptTag = document.getElementsByTagName('script')[0];
    firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);

    var player;
    function onYouTubeIframeAPIReady() {
        player = new YT.Player('player', {
            height: '200',
            width: '200',
            videoId: "Cm0qaXi9THA",
            events: {}
        });
    }

    function playVideo() {
        player.playVideo();
    }
    function pauseVideo() {
        player.pauseVideo();
    }
    function changeVideo(id) {
        document.getElementById("surveyed").innerHTML="";
        player.loadVideoById(id);
        player.playVideo();
    }
    function showSurveyed(message) {
        if(message.operation==="pause") {
            pauseVideo();
            document.getElementById("surveyed").innerHTML="<h1>"+message.nickname+" zapauzował!!! </h1>";
        }
        if(message.operation==="start") {
            playVideo();
            document.getElementById("surveyed").innerHTML="<h1>"+message.nickname+" włączył muzykę dalej!!! </h1>";
        }
    }


    function sendYtUrl() {
        var ytId = document.getElementById("vidId").value;
        var nickname = document.getElementById("nickname").value;
        stompClient.send("/app/broadcast", {}, 
                  JSON.stringify(
                    {"nickname": nickname, "videoId": ytId}
                    ));
    }

    function sendControl(operation) {
        var nickname = document.getElementById("nickname").value;
        stompClient.send("/app/control", {}, 
                  JSON.stringify(
                    {"nickname": nickname, "operation": operation}
                    ));
    }

    function receiveMessageFrame(messageOutput) {
        console.log("DEBUG: "+messageOutput);

        if(messageOutput.videoId !== null)
            changeVideo(messageOutput.videoId);

        if(messageOutput.operation !== null)
            showSurveyed(messageOutput);
    }