package kg.app.quiz.controllers;

import kg.app.quiz.models.DTOs.QuizDTO;
import kg.app.quiz.services.QuizService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/quiz")
public class QuizController {
    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping("/save")
    ResponseEntity<?> save (@RequestBody QuizDTO quizDTO){
        QuizDTO savedQuiz = quizService.save(quizDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedQuiz);
    }
}
