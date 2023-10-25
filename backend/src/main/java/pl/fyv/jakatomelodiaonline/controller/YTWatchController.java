package pl.fyv.jakatomelodiaonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;
import pl.fyv.jakatomelodiaonline.models.GameControlMessage;
import pl.fyv.jakatomelodiaonline.models.GameMessage;
import pl.fyv.jakatomelodiaonline.models.GameStartMessage;
import pl.fyv.jakatomelodiaonline.service.YtService;

@RestController
public class YTWatchController {

    @Autowired
    YtService ytService;

    @MessageMapping("/broadcast")
    @SendTo("/topic/yt")
    public GameStartMessage broadcastYtVideo(GameStartMessage gameMessage) throws Exception {
        System.out.println("Message received broadcastYtVideo: "+ gameMessage.toString());
        return new GameStartMessage(gameMessage.getNickname(), ytService.getYtIdFromUrl(((GameStartMessage) gameMessage).getVideoId()));
    }

    @MessageMapping("/control")
    @SendTo("/topic/yt")
    public GameControlMessage controlYtVideo(GameControlMessage gameMessage) throws Exception {
        System.out.println("Message received controlYtVideo: "+ gameMessage.toString());
        return new GameControlMessage(gameMessage.getNickname(), gameMessage.getOperation());
    }

}
