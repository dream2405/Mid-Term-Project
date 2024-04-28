package kr.ac.dankook.ace.oss_project.board;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class TextData {
    String userName;
    String text;
}
