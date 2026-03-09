package app.mirtiza.userservice.services;

import app.mirtiza.userservice.dto.CreateUserDto;
import app.mirtiza.userservice.dto.SuccessResponseDto;
import app.mirtiza.userservice.models.User;
import app.mirtiza.userservice.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public SuccessResponseDto validateUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()) {
            return new SuccessResponseDto("Success", true, HttpStatus.OK.value());
        }
        return new SuccessResponseDto("Error", false, HttpStatus.NOT_FOUND.value());
    }
}
