package app.mirtiza.userservice.dto;

import org.springframework.http.HttpStatus;

public record SuccessResponseDto(
        String message,
        Boolean success,
        Integer status
) {
}
