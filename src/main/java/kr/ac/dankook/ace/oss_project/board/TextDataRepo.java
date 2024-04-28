package kr.ac.dankook.ace.oss_project.board;

import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayDeque;
import java.util.Deque;

@Repository
@Data
public class TextDataRepo {
    private Deque<TextData> textData = new ArrayDeque<>();

    void deleteAll() {
        this.textData.clear();
    }

    void addTextData(TextData textData) {
        this.textData.addFirst(textData);
    }

    void deleteTextData(TextData textData) {
        this.textData.remove(textData);
    }
}
