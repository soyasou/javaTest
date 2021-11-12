package com.hapt.hapt.controllers;

import com.hapt.hapt.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.hapt.hapt.models.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Register {
    @Autowired
    UserRepository userRepository;

    // **@RequestMapping(path = "/registre", method = RequestMethod.GET) */
    @GetMapping("/register")

    public String getRegister(Model model) {
        model.addAttribute("user", new User());

        return "register";
    }

    // ** le code dessus pour afficher page registre */
    @PostMapping("/process_register")
    public String processRegistre(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodePassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodePassword);
        userRepository.save(user);
        return "login";
    }

}
