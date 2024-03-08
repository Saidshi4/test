package com.example.test;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
@CrossOrigin(origins = "https://test-three-ebon-73.vercel.app/")
public class Controller {
    @GetMapping("/test")
    public String test(){
        return "HelloWorld";
    }
}
