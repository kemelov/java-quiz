package kg.app.quiz.models.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Data
@JsonIgnoreProperties(value = {"id", "choiceDTOS"}, allowGetters = true)
public class TitleDTO implements Serializable {
    private Long id;
    private String title;
    private Set<ChoiceDTO> choiceDTOS = getChoiceDTOS();
}
