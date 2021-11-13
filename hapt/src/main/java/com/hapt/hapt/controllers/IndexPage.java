package com.hapt.hapt.controllers;

import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import com.hapt.hapt.models.User;
import com.hapt.hapt.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPage {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getIndex() {
        return "index";
    }

    @RequestMapping(path = "/etudiant", method = RequestMethod.GET)
    public String getEtudiant() {
        return "etudiant";
    }

    @RequestMapping(path = "/formateur", method = RequestMethod.GET)
    public String getFormateur() {
        return "formateur";
    }

    @RequestMapping(path = "/formations", method = RequestMethod.GET)
    public String getFormations() {
        return "formations";
    }

    @RequestMapping(path = "/planning", method = RequestMethod.GET)
    public String getPlanning() {
        return "planning";
    }

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String getTest() {
        return "test";
    }

    @RequestMapping(path = "/entreprise", method = RequestMethod.GET)
    public String getEntreprise() {
        return "entreprise";
    }

    @RequestMapping(path = "/modif_formation", method = RequestMethod.GET)
    public String getModif_formation() {
        return "modif_formation";
    }

    @GetMapping(path = "/modif_etudiant")
    public String listUsers(Model model) {
        List<User> listUsers = userRepository.findAll();
        model.addAttribute("listUsers", listUsers);
        return "modif_etudiant";
    }

    @GetMapping(path = "/supp_etudiant")
    public String supplistUsers(Model model) {
        List<User> listUsers = userRepository.findAll();
        model.addAttribute("listUsers", listUsers);
        return "supp_etudiant";
    }
}
