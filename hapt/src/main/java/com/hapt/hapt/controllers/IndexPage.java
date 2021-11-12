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

    @RequestMapping(path = "/modif_etudiant", method = RequestMethod.GET)
    public String getModif_etudiant() {
        return "modif_etudiant";
    }
}
