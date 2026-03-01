package app.mirtiza.linkservice.dtos;

import jakarta.validation.constraints.*;

public record CreateLinkDto(
        @NotBlank(message = "Original URL is required")
        @Pattern(
                regexp = "^(https?://).+",
                message = "Original URL must start with http:// or https://"
        )
        String originalUrl,

        @NotBlank(message = "Short URL is required")
        @Size(min = 4, max = 20, message = "Short URL must be between 4 and 20 characters")
        @Pattern(
                regexp = "^[a-zA-Z0-9_-]+$",
                message = "Short URL can only contain letters, numbers, - and _"
        )
        String shortUrl,

        @NotNull(message = "User ID is required")
        @Positive(message = "User ID must be positive")
        Long userId
) {
}
