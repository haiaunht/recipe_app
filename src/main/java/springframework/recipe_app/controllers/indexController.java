package springframework.recipe_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @RequestMapping({"","/" ,"/index"})
    public String getIndexPage(){
        return "index";
    }
}
