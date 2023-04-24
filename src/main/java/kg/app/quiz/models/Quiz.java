package kg.app.quiz.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name ="tb_quiz")
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question;
    private String answer;
    private boolean isSolved;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Choice> choices = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "title_id")
    private Title title;

    @Enumerated(EnumType.STRING)
    private QuizCategory category;
}
