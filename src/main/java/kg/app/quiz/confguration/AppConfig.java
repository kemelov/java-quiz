package kg.app.quiz.confguration;

import kg.app.quiz.mapper.ChoiceMapper;
import kg.app.quiz.mapper.TitleMapper;
import kg.app.quiz.mapper.QuizMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    QuizMapper quizMapper(){
        return QuizMapper.INSTANCE;
    }

    @Bean
    ChoiceMapper choiceMapper(){
        return ChoiceMapper.INSTANCE;
    }

    @Bean
    TitleMapper titleMapper(){
        return TitleMapper.INSTANCE;
    }
}
