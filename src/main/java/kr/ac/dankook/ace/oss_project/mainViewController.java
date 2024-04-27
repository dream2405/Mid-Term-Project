package kr.ac.dankook.ace.oss_project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class mainViewController {
    @GetMapping("/")
    public String mainView(Model model) {
        model.addAttribute("tabMenu", "intro");

        return "main";
    }

    @GetMapping("/{tabMenu}")
    public String introView(@PathVariable String tabMenu, Model model) {
        model.addAttribute("tabMenu", tabMenu);

        return "main";
    }
}
