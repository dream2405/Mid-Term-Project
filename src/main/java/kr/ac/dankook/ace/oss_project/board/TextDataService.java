package kr.ac.dankook.ace.oss_project.board;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Queue;

@Service
@NoArgsConstructor
@Data
public class TextDataService {
    private TextDataRepo textDataRepo;

    @Autowired
    public TextDataService(TextDataRepo textDataRepo) {
        this.textDataRepo = textDataRepo;
    }

    @Autowired
    public void setTextDataRepo(TextDataRepo textDataRepo) {
        this.textDataRepo = textDataRepo;
    }

    public Queue<TextData> findAll() {
        return this.textDataRepo.getTextData();
    }

    public void add(TextData textData) {
        this.textDataRepo.addTextData(textData);
    }
}
