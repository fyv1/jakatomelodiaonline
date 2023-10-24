package pl.fyv.jakatomelodiaonline;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.simp.stomp.StompSessionHandler;
import org.springframework.web.socket.messaging.WebSocketStompClient;

@SpringBootTest
class JakatomelodiaonlineApplicationTests {

	@Autowired
	private WebSocketStompClient stompClient;

	@Test
	void contextLoads() {
	}
}
