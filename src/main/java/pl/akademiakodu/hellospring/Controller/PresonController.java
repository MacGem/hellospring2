package pl.akademiakodu.hellospring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.hellospring.dao.PersonDao;
import pl.akademiakodu.hellospring.dao.PersonDaoImpl;
import pl.akademiakodu.hellospring.model.Person;

/**
 * Created by Admin on 28.07.2017.
 */
@Controller
public class PresonController {

    private PersonDao personDao = new PersonDaoImpl();

    @GetMapping("/person/add")
    public String add(){
        return "person/add";
    }

    @PostMapping("/person/create")
        public String create(@ModelAttribute Person person, ModelMap modelMap){
        modelMap.addAttribute("person", person);
        return "person/show";

        }

    @GetMapping("/person/search")
    public String search(){
        return "person/search";
    }
    @GetMapping("/person/results")
    public String results(@ModelAttribute Person person, ModelMap modelMap){
        System.out.println("Parameter" + person.getLastName());
        String lastName = person.getLastName();
        modelMap.addAttribute("people", personDao.findByLastName(lastName));

        return "person/results";
    }

    @GetMapping("/person/all")
    public String all(ModelMap modelMap){
        modelMap.addAttribute("people", personDao.findAll());
        return "person/all";
    }
//    @ResponseBody
    @GetMapping("/person/{id}")
    public String display(@PathVariable long id, ModelMap modelMap){

        //szukaj po id:
//        System.out.println("Moje id to: " +id);
        modelMap.addAttribute("people", personDao.findOne(id));
        return "person/results";
    }

    }

