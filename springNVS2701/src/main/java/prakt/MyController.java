package prakt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
