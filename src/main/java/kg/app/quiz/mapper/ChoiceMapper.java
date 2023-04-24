package kg.app.quiz.mapper;

import kg.app.quiz.models.Choice;
import kg.app.quiz.models.DTOs.ChoiceDTO;
import kg.app.quiz.models.DTOs.QuizDTO;
import kg.app.quiz.models.Quiz;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Set;

@Mapper
public interface ChoiceMapper {
    ChoiceMapper INSTANCE = Mappers.getMapper(ChoiceMapper.class);

    @Mapping(source = "quiz.id", target = "quizId")
    ChoiceDTO toDTO (Choice choice);

    @InheritInverseConfiguration
    Choice toEntity (ChoiceDTO choiceDTO);

    @Mapping(source = "quiz.id", target = "quizId")
    Set<ChoiceDTO> toDTOLIst(Set<Choice> choiceList);

    @InheritInverseConfiguration
    Set<Choice> toEntityList(Set<ChoiceDTO> choiceDTOList);
}
