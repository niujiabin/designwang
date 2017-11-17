package design.job.websocket;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.HandshakeInterceptor;

/**
 * Created by zhuqiang on 2015/6/23 0023.
 */
@Configuration
@EnableWebSocket//开启websocket
public class WebSocketConfig implements WebSocketConfigurer {

    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {

        System.out.println("websocketHandler");
        registry.addHandler(new WebSocketHander(),"/echo.ws").addInterceptors(new HandShakeInterceptor()); //支持websocket 的访问链接
        registry.addHandler(new WebSocketHander(),"/sockjs/echo").addInterceptors(new HandShakeInterceptor()).withSockJS(); //不支持websocket的访问链接
    }
}