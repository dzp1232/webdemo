package cn.joeg.controller;


import cn.joeg.dto.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {


    @RequestMapping("/hello/{name}")
    @PostMapping
    public Person hello(@PathVariable("name") String name) {
        Person person = new Person();
        person.setName(name);
        person.setAge(10);
        return person;
    }



    @RequestMapping("/index/{name}")
    public String index() {
        return "index";
    }

}
