package kr.ac.dankook.ace.oss_project;

import kr.ac.dankook.ace.oss_project.board.TextData;
import kr.ac.dankook.ace.oss_project.board.TextDataRepo;
import kr.ac.dankook.ace.oss_project.board.TextDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class mainViewController {
    private TextData textData;
    private TextDataService textDataService;

    @Autowired
    public mainViewController(TextData textData, TextDataService textDataService) {
        this.textData = textData;
        this.textDataService = textDataService;
    }

    @GetMapping("/")
    public String mainView(Model model) {
        model.addAttribute("tabMenu", "intro");

        return "main";
    }

    @GetMapping("/{tabMenu}")
    public String introView(@PathVariable String tabMenu, Model model) {
        if (tabMenu.equals("board")) {
            model.addAttribute("tabMenu", "board");
            model.addAttribute("textData", new TextData());
            model.addAttribute("datas", textDataService.getTextDataRepo().getTextData());

            return "main";
        }

        model.addAttribute("tabMenu", tabMenu);

        return "main";
    }

    @PostMapping("/board/submit")
    public String submitBoard(@ModelAttribute("formData") TextData textData, Model model) {
        this.textDataService.add(textData);

        return "redirect:/board";
    }
}
