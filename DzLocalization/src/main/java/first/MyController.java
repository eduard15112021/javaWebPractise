package first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MyController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }


    @RequestMapping("/submit")
    public String mainGage(){
        return "mainpage";
    }
}
