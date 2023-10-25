    var stompClient = null;
    
    function connect() {
        var socket = new SockJS('http://localhost:8080/ytapp');
        stompClient = Stomp.over(socket);  
        stompClient.connect({}, function(frame) {
            console.log('Connected: ' + frame);
            stompClient.subscribe('/topic/yt', function(messageOutput) {
                receiveMessageFrame(JSON.parse(messageOutput.body));
            });
        });
    }
    
    function disconnect() {
        if(stompClient != null) {
            stompClient.disconnect();
        }
        console.log("Disconnected");
    }

    