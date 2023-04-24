package kg.app.quiz.controllers;

import kg.app.quiz.models.DTOs.TitleDTO;
import kg.app.quiz.services.TitleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "/api/v1/title")
public class TitleController {
    private final TitleService titleService;

    public TitleController(TitleService titleService) {
        this.titleService = titleService;
    }

    @PostMapping("/save")
    ResponseEntity<?> save(TitleDTO titleDTO){
        TitleDTO savedTitle = titleService.save(titleDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTitle);
    }

    @GetMapping("/findById/{id}")
    TitleDTO findById(@PathVariable Long id){
        return titleService.findById(id);
    }
}
