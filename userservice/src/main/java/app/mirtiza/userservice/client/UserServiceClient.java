package app.mirtiza.userservice.client;

import app.mirtiza.userservice.models.Todo;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange(url = "https://jsonplaceholder.typicode.com")
public interface UserServiceClient {
    @GetExchange("/todos?")
    List<Todo> getTodos();
}
