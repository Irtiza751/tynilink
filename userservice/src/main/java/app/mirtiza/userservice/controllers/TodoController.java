package app.mirtiza.userservice.controllers;

import app.mirtiza.userservice.client.UserServiceClient;
import app.mirtiza.userservice.models.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/todos")
public class TodoController {
    private final UserServiceClient userServiceClient;

    @GetMapping
    ResponseEntity<List<Todo>> getTodos() {
        return ResponseEntity.ok(userServiceClient.getTodos());
    }
}
