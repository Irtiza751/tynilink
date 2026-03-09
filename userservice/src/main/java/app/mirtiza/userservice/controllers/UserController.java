package app.mirtiza.userservice.controllers;

import app.mirtiza.userservice.dto.CreateUserDto;
import app.mirtiza.userservice.dto.SuccessResponseDto;
import app.mirtiza.userservice.models.User;
import app.mirtiza.userservice.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @PostMapping
    ResponseEntity<User> createUser(@RequestBody CreateUserDto createUserDto) {
        return new ResponseEntity<>(userService.createUser(createUserDto), HttpStatus.CREATED);
    }

    @GetMapping("/validate/{id}")
    ResponseEntity<SuccessResponseDto> validateUser(@PathVariable Long id) {
        return ResponseEntity.ok(userService.validateUser(id));
    }
}
