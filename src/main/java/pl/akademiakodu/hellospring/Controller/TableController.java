package pl.akademiakodu.hellospring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.hellospring.dao.TableDao;
import pl.akademiakodu.hellospring.model.Table;

/**
 * Created by Admin on 27.07.2017.
 */
@Controller
public class TableController {

    @GetMapping("/loop")
    public String findAll(ModelMap modelMap) {
        modelMap.addAttribute("tables", TableDao.findAll());
        return "loop";
    }

    @PostMapping("/create")
    public String create (@ModelAttribute Table table, ModelMap modelMap){
        System.out.println(table);
        modelMap.addAttribute("table",table);
        return "add";
    }
    @GetMapping("/bookadd")
    public String add(){
        return "add";
    }

}

