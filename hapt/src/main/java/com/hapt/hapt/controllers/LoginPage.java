package com.hapt.hapt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginPage {

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String getLogin() {
        return "login";
    }

}
