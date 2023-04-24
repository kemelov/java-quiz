package kg.app.quiz.models.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kg.app.quiz.models.QuizCategory;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class QuizDTO {
    @JsonIgnore
    private Long id;
    private String question;
    private String answer;
    private Set<ChoiceDTO> choices = new HashSet<>();
    private boolean isSolved;
    private QuizCategory category;
    private Long titleId;
}
