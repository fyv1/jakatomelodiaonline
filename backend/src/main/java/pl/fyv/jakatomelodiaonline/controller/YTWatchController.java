package pl.fyv.jakatomelodiaonline.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;
import pl.fyv.jakatomelodiaonline.models.Message;

@RestController
public class YTWatchController {

    @MessageMapping("/getYouTubeMovieTimestamp")
    @SendTo("/topic/messages")
    public Message send() throws Exception {
        return new Message(1);
    }

}
