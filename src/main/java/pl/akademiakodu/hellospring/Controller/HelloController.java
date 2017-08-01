package pl.akademiakodu.hellospring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.akademiakodu.hellospring.model.Lotto;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by Admin on 27.07.2017.
 */
@Controller
public class HelloController {

    @GetMapping("/")
    public String hello(ModelMap modelMap) {
        modelMap.addAttribute("person", "Maciek");
        return "hello";
    }

    @ResponseBody
    @GetMapping("/hello")
    public String helloName() {
        return "Hello Maciek";
    }

    //wyswietl liczbe losowa

    @GetMapping("/random")
    public String getRandom(ModelMap modelMap)

    {
//        Set<Integer> numbers = new HashSet<>();
//
//        Random random = new Random();
//        while (numbers.size() != 6) {
//            int x = random.nextInt(55);
//            numbers.add(x);
//
//        }
//        modelMap.addAttribute("numbers", numbers);

        //z klasy lotto:
        modelMap.addAttribute("numbers", Lotto.getRandomNumbers());
        return "random";
    }

    @GetMapping("/if")
    public String ifStatement(ModelMap modelMap){
        modelMap.addAttribute("text", "Michal");
        modelMap.addAttribute("myText", "Simple Task");
        modelMap.addAttribute("a", 123);
        modelMap.addAttribute("b", 456);
        return "if";
    }



}
