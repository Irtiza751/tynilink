package app.mirtiza.linkservice.client;


import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange(url = "http://linkservice")
public interface UserServiceClient {
    @GetExchange("/validate/{id}")
    Object isValidUserId(Long id);
}
