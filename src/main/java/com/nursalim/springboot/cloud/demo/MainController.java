package com.nursalim.springboot.cloud.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("")
public class MainController {

    @GetMapping
    public String welcome(){
        return "Welcome to Google SSO";
    }

    @GetMapping("/user")
    public Principal user(Principal principal){
        System.out.println("Username: " + principal.getName());
        return principal;
    }
}
