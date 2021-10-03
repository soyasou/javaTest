package com.hapt.hapt.controllers;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPage {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getIndex() {
        return "index";
    }

}
