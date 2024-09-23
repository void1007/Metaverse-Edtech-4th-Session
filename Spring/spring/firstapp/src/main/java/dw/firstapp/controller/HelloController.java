package dw.firstapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/Hellogays")
    public String hello(){
        return "Hello gays!!";
    }
}


