package io.github.parkwoong.webflux.handler;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.server.ResponseStatusException;

@Configuration
public class SampleHandler {
    @Bean
    RouterFunction<ServerResponse> sample() {
        return route(
                GET("/sample/error"),
                request -> {
                    throw new ResponseStatusException(BAD_REQUEST, "Sample invalid request");
                });
    }
}
