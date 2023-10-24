    var stompClient = null;
    
    function connect() {
        var socket = new SockJS('http://localhost:8080/getYouTubeMovieTimestamp');
        stompClient = Stomp.over(socket);  
        stompClient.connect({}, function(frame) {
            console.log('Connected: ' + frame);
            stompClient.subscribe('/topic/messages', function(messageOutput) {
                showMessageOutput(JSON.parse(messageOutput.body));
            });
        });
    }
    
    function disconnect() {
        if(stompClient != null) {
            stompClient.disconnect();
        }
        console.log("Disconnected");
    }
    
    function showMessageOutput(messageOutput) {
        console.log("xd "+messageOutput.timestamp);
    }