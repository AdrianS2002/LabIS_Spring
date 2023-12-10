package org.example.tutorial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Controller

//@RequestMapping("hello")
public class HelloController {

//    @GetMapping
//    @ResponseBody
//    public String hello1() {
//        return "Hello, Spring!";
//    }


    //Handles requests at path /hello

//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring from root path /hello!";
//    }
    //lives at /hello/goodbye
//    @GetMapping("goodbye")
//    public String goodbye() {
//        return "Goodbye, Spring from root path /goodbye!";
//    }

    //Handles requests at path /hello?name=LaunchCode
    @RequestMapping(value="hello",method={RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name, Model model){
        String greeting= "Hello, " + name + "!";
        model.addAttribute("greeting",greeting); //primul atribut trebuie sa fie la fel cu cel din html
        return "hello";
    }

    //Handles request of the form /hello/LaunchCode
    //  /hello/hello
    @GetMapping("{name}")  //variabila din paranteza trebue sa fie aceeasi cu parametrul metodei
    public String helloWithPathParam(@PathVariable String name, Model model ){
        String greeting= "Hello, " + name + "!";
        model.addAttribute("greeting",greeting);
        return "hello";
    }
    //hello/form
    @GetMapping("form")
    public String helloForm(){
      return "form";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model){
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("JavaScript");
        names.add("Python");
        model.addAttribute("names",names);
        return "helloList";
    }
}
