package kg.app.quiz.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Quiz {
    private Long id;
    private String question;
    private String answer;
    private List<String> choices;
    private int numberOfChoices;
}
