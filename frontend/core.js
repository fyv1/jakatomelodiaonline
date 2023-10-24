    var songid = document.getElementsByName("songid");
    if (songid === null) songid = "JfJYHfrOGgQ";
    var tag = document.createElement('script');

    tag.src = "https://www.youtube.com/iframe_api";
    var firstScriptTag = document.getElementsByTagName('script')[0];
    firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);

    var player;
    function onYouTubeIframeAPIReady() {
        player = new YT.Player('player', {
            height: '0',
            width: '0',
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
    function changeVideo() {
        player.loadVideoById("jO_Zkx2teNI");
        player.playVideo();
    }
    function setTime() {
        player.seekTo(53);
    }