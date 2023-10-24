package pl.fyv.jakatomelodiaonline.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;
import pl.fyv.jakatomelodiaonline.models.Message;
import pl.fyv.jakatomelodiaonline.models.YtVideoUrlMessage;

@RestController
public class YTWatchController {

    @MessageMapping("/getYouTubeMovieTimestamp")
    @SendTo("/topic/yt")
    public Message send() throws Exception {
        return new Message(1);
    }

    @MessageMapping("/ytvideo")
    @SendTo("/topic/yt")
    public YtVideoUrlMessage broadcastYtVideo(YtVideoUrlMessage ytVideoUrlMessage) throws Exception {
        System.out.println("odebrano "+ ytVideoUrlMessage.getVideoId());
        return new YtVideoUrlMessage(ytVideoUrlMessage.getNickname(), ytVideoUrlMessage.getVideoId());
    }

}
