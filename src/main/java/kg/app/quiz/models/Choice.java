package kg.app.quiz.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name ="tb_choice")
public class Choice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String choiceContent;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;
}
