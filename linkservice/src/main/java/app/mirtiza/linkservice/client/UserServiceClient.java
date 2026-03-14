package app.mirtiza.linkservice.client;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface UserServiceClient {
    @GetExchange("/validate/{id}")
    Object isValidUserId(@PathVariable Long id);
}