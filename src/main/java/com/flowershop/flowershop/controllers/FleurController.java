package com.flowershop.flowershop.controllers;

import com.flowershop.flowershop.entities.Client;
import com.flowershop.flowershop.entities.Fleur;
import com.flowershop.flowershop.services.ClientService;
import com.flowershop.flowershop.services.FleurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
public class FleurController {
    @Autowired
    FleurService fleurService;

    @RequestMapping("/createFleur")
    public String CreateFleur(){
        return "CreateFleur";
    }
    //@RequestMapping("saveFleur")
    //public String saveFleur(@ModelAttribute("fleur") Fleur fleur){
      //  fleurService.saveFleur(fleur);
       // return "CreateFleur";
    //}

    @RequestMapping("saveFleur")
    public String saveFleur(@RequestParam("file") MultipartFile file,
                            @RequestParam("nom") String nom,
                            @RequestParam("prix") Long prix,
                            @RequestParam("couleur") String couleur)
    {
        fleurService.saveFleur(file, nom, couleur, prix);
        return "CreateFleur";
    }

    @RequestMapping("/fleurList")
    public String fleurList(ModelMap modelMap){
        List<Fleur> fleurcontroller = fleurService.getAllFleurs();
        modelMap.addAttribute("fleursJsp",fleurcontroller);
        //this is the name of the jsp file
        return "FleurList";
    }

    @RequestMapping("/deleteFleur")
    public String deleteFleur(@RequestParam("id") Long id,ModelMap modelMap){
        fleurService.deleteFleurById(id);
        List<Fleur> fleurcontroller = fleurService.getAllFleurs();
        modelMap.addAttribute("fleursJsp",fleurcontroller);
        //this is the name of the jsp file
        return "FleurList";
    }
}
