package app.mirtiza.userservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    private Long userId;
    private Long id;
    private String title;
    private Boolean completed;
}

