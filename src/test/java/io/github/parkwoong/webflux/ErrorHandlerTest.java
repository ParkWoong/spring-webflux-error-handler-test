package io.github.parkwoong.webflux;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ErrorHandlerTest {
    @LocalServerPort int port;

    @Test
    void returnsSimpleBadRequest() {
        String body =
                WebClient.create("http://127.0.0.1:" + port)
                        .get()
                        .uri("/sample/error")
                        .retrieve()
                        .onStatus(status -> true, response -> reactor.core.publisher.Mono.empty())
                        .bodyToMono(String.class)
                        .block();
        assertTrue(body.contains("Sample invalid request"));
        assertFalse(body.contains("timestamp"));
    }
}
