package kg.app.quiz.services.impl;

import kg.app.quiz.mapper.ChoiceMapper;
import kg.app.quiz.models.Choice;
import kg.app.quiz.models.DTOs.ChoiceDTO;
import kg.app.quiz.repositories.ChoiceRepository;
import kg.app.quiz.services.ChoiceService;
import org.springframework.stereotype.Service;

@Service
public class ChoiceServiceImpl implements ChoiceService {
    private final ChoiceRepository choiceRepository;
    private final ChoiceMapper choiceMapper;

    public ChoiceServiceImpl(ChoiceRepository choiceRepository, ChoiceMapper choiceMapper) {
        this.choiceRepository = choiceRepository;
        this.choiceMapper = choiceMapper;
    }


    @Override
    public ChoiceDTO save(ChoiceDTO choiceDTO) {
        Choice choice = choiceMapper.toEntity(choiceDTO);
        choice = choiceRepository.save(choice);
        return choiceMapper.toDTO(choice);
    }
}
