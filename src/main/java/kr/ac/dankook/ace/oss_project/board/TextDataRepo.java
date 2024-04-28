package kr.ac.dankook.ace.oss_project.board;

import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Data
public class TextDataRepo {
    private List<TextData> textData;

    void deleteAll() {
        this.textData.clear();
    }

    void addTextData(TextData textData) {
        this.textData.add(textData);
    }

    void deleteTextData(TextData textData) {
        this.textData.remove(textData);
    }
}
