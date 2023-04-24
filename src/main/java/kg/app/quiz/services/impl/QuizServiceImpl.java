package kg.app.quiz.services.impl;

import kg.app.quiz.mapper.ChoiceMapper;
import kg.app.quiz.mapper.QuizMapper;
import kg.app.quiz.models.Choice;
import kg.app.quiz.models.DTOs.QuizDTO;
import kg.app.quiz.models.Quiz;
import kg.app.quiz.models.Title;
import kg.app.quiz.repositories.QuizRepository;
import kg.app.quiz.repositories.TitleRepository;
import kg.app.quiz.services.QuizService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class QuizServiceImpl implements QuizService {
    private final QuizMapper quizMapper;
    private final QuizRepository quizRepository;
    private final TitleRepository titleRepository;
    private final ChoiceMapper choiceMapper;

    public QuizServiceImpl(QuizMapper quizMapper, QuizRepository quizRepository, TitleRepository titleRepository, ChoiceMapper choiceMapper) {
        this.quizMapper = quizMapper;
        this.quizRepository = quizRepository;
        this.titleRepository = titleRepository;
        this.choiceMapper = choiceMapper;
    }

    @Override
    public QuizDTO save(QuizDTO quizDTO) {
        Optional<Title> title = titleRepository.findById(quizDTO.getTitleId());
        if (title.isEmpty()){
            throw new NoSuchElementException("Нет такой темы с таким ID");
        }
        Quiz quiz = quizMapper.toEntity(quizDTO);
        for (Choice choice : quiz.getChoices()) {
            choice.setQuiz(quiz);
        }
        quiz = quizRepository.save(quiz);
        return quizMapper.toDTO(quiz);
    }

    @Override
    public QuizDTO getRandomUnsolvedQuiz() {
        return null;
    }
}
