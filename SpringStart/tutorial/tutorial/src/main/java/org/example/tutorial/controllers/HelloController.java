package org.example.tutorial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@Controller
@ResponseBody
@RequestMapping("hello")
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
    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring from root path /goodbye!";
    }

    //Handles requests at path /hello?name=LaunchCode
    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name){
        return "Hello "+ name +" !";
    }

    //Handles request of the form /hello/LaunchCode
    //  /hello/hello
    @GetMapping("{name}")  //variabila din paranteza trebue sa fie aceeasi cu parametrul metodei
    public String helloWithPathParam(@PathVariable String name){
        return "Hello "+ name + " !";
    }
    //hello/form
    @GetMapping("form")
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>"+ //submit a request to /hello
                "<input type='text' name='name'>"+
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
