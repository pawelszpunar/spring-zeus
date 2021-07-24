package com.pawelszpunar.module.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//@RequestMapping({"/", "/index", "/index.html","/home.html"})
//@RequestMapping("/")
// @GetMapping({"/", "/index", "/index.html"})

@Controller
public class HomeController {

    @GetMapping({"/", "/index", "/index.html", "/index.html"})
    public String getHome(Model model) {

        // str
        model.addAttribute("name", "Michał");

        // obj
        PersonDto person = new PersonDto(
                "Michał",
                "Szałkowski",
                18
        );
        model.addAttribute("person", person);

        // list obj
        List<PersonDto> persons = List.of(
                new PersonDto("Wilhelm ", "Conrad", 18),
                new PersonDto("Maria", "Skłodowska-Curie", 19),
                new PersonDto("Chandrasekhara ", "Venkata Raman", 20)
        );
        model.addAttribute("persons", persons);

        return "home.html";
    }


}
