package kg.app.quiz.models.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kg.app.quiz.models.Quiz;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class ChoiceDTO {
    @JsonIgnore
    private final Long id;
    private final String choiceContent;
    @JsonIgnore
    private Long quizId;
}
