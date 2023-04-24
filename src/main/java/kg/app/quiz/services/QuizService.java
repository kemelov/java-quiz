package kg.app.quiz.services;

import kg.app.quiz.models.DTOs.QuizDTO;

public interface QuizService {
    QuizDTO save(QuizDTO quizDTO);
    QuizDTO getRandomUnsolvedQuiz();
}
