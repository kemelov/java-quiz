package kg.app.quiz.services;

import kg.app.quiz.models.DTOs.TitleDTO;

public interface TitleService {
    TitleDTO save(TitleDTO titleDTO);
    TitleDTO findById(Long id);
}
