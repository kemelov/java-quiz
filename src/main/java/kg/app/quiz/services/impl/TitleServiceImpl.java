package kg.app.quiz.services.impl;

import kg.app.quiz.mapper.TitleMapper;
import kg.app.quiz.models.DTOs.TitleDTO;
import kg.app.quiz.models.Title;
import kg.app.quiz.repositories.TitleRepository;
import kg.app.quiz.services.TitleService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class TitleServiceImpl implements TitleService {
    private final TitleMapper titleMapper;
    private final TitleRepository titleRepository;

    public TitleServiceImpl(TitleMapper titleMapper, TitleRepository titleRepository) {
        this.titleMapper = titleMapper;
        this.titleRepository = titleRepository;
    }

    @Override
    public TitleDTO save(TitleDTO titleDTO) {
        Title title = titleMapper.toEntity(titleDTO);
        title = titleRepository.save(title);
        return titleMapper.toDTO(title);
    }

    @Override
    public TitleDTO findById(Long id) {
        Optional<Title> title = titleRepository.findById(id);
        if (title.isEmpty()){
            throw new NoSuchElementException();
        }
        return titleMapper.toDTO(title.get());
    }
}
