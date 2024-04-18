package kr.ac.dankook.ace.oss_project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainViewController {
    @GetMapping("/")
    public String mainView(Model model) {

        return "main";
    }
}
