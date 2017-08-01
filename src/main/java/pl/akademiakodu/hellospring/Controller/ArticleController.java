package pl.akademiakodu.hellospring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.akademiakodu.hellospring.model.Article;

/**
 * Created by Admin on 27.07.2017.
 */
@Controller
public class ArticleController {

    @GetMapping("/add")
    public String add() {
        return "article/add";
    }

    @GetMapping("/show")
    public String show(@ModelAttribute Article article, ModelMap modelMap){
        modelMap.addAttribute("article", article);
        return "article/show";
    }
}
