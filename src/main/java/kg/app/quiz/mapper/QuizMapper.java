package kg.app.quiz.mapper;

import kg.app.quiz.models.DTOs.QuizDTO;
import kg.app.quiz.models.Quiz;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Set;

@Mapper
public interface QuizMapper {
    QuizMapper INSTANCE = Mappers.getMapper(QuizMapper.class);

    @Mapping(source = "title.id", target = "titleId")
    @Mapping(source = "quiz.choices", target = "choices")
    QuizDTO toDTO (Quiz quiz);

    @InheritInverseConfiguration
    Quiz toEntity (QuizDTO quizDTO);

    Set<QuizDTO> toDTOLIst(Set<Quiz> quizList);

    Set<Quiz> toEntityList(Set<QuizDTO> quizDTOList);
}
