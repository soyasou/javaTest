package com.hapt.hapt.controllers;

import com.hapt.hapt.models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.hapt.hapt.repositories.RoleRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Arrays;

@Controller
public class AddRole {
    @Autowired
    RoleRepository roleRepository;

    @RequestMapping(value = "/role", method = RequestMethod.GET)
    public String commandLineRunner() {
        roleRepository.deleteAllInBatch();
        Role admin = new Role("admin");
        Role etudiant = new Role("etudiant");
        Role entreprise = new Role("entreprise");
        Role formateur = new Role("formateur");
        roleRepository.saveAll(Arrays.asList(admin, etudiant, entreprise, formateur));
        return "redirect:/";
    }

}
