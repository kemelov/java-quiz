package kg.app.quiz.mapper;


import kg.app.quiz.models.DTOs.TitleDTO;
import kg.app.quiz.models.Title;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Set;

@Mapper()
public interface TitleMapper {
    TitleMapper INSTANCE = Mappers.getMapper(TitleMapper.class);

    TitleDTO toDTO (Title title);
    Title toEntity (TitleDTO titleDTO);
    Set<TitleDTO> toDTOList(Set<Title> titleList);
    Set<Title> toEntityList(Set<TitleDTO> titleDTOList);
}
