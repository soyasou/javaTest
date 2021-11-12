package com.hapt.hapt.controllers;

import com.hapt.hapt.models.Formations;
import com.hapt.hapt.repositories.FormationsRepository;
import com.hapt.hapt.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddFormation {
    @Autowired
    UserRepository userRepository;
    FormationsRepository formationsRepository;

    @GetMapping("/add_formation")

    public String getFormations(Model model) {
        model.addAttribute("formations", new Formations());
        return "add_formation";
    }

    @PostMapping("/process_formation")
    public String processFormation(Formations formations) {
        try {
            formationsRepository.save(formations);
        } catch (Exception ex) {
            return "Error deleting the user:" + ex.toString();
        }
        return "index";

    }
}
