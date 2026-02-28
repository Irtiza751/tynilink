package app.mirtiza.userservice.services;

import app.mirtiza.userservice.dto.CreateUserDto;
import app.mirtiza.userservice.models.User;
import app.mirtiza.userservice.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User createUser(CreateUserDto userDto) {
        User user = User.builder()
                .username(userDto.getUsername())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .build();

        return userRepository.save(user);
    }
}
