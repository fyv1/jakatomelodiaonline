    var tag = document.createElement('script');

    tag.src = "https://www.youtube.com/iframe_api";
    var firstScriptTag = document.getElementsByTagName('script')[0];
    firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);

    var player;
    function onYouTubeIframeAPIReady() {
        player = new YT.Player('player', {
            height: '100',
            width: '100',
            videoId: "yOKz82_a2B4",
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
        console.log(id);
        console.log("gonna change player?")
        player.loadVideoById(id);
        player.playVideo();
    }
    function setTime() {
        player.seekTo(53);
    }

    function sendYtUrl() {
        var ytId = document.getElementById("vidId").value;
        var nickname = document.getElementById("nickname").value;
        stompClient.send("/app/ytvideo", {}, 
                  JSON.stringify(
                    {"nickname": nickname, "videoId": ytId}
                    ));
    }
    
    function showMessageOutput(messageOutput) {
        console.log("xd "+messageOutput.nickname + " "+ messageOutput.videoId);

        changeVideo(messageOutput.videoId);
    }