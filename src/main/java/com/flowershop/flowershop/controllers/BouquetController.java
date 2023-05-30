package com.flowershop.flowershop.controllers;

import com.flowershop.flowershop.entities.Bouquet;
import com.flowershop.flowershop.entities.BouquetType;
import com.flowershop.flowershop.entities.Client;
import com.flowershop.flowershop.entities.Fleur;
import com.flowershop.flowershop.services.BouquetService;
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
public class BouquetController {
    @Autowired
    BouquetService bouquetService;

    @Autowired
    FleurService fleurService;
    @RequestMapping("/CreateBouquet")
    public String CreateBouquet(ModelMap modelMap){

        List<Fleur> fleurcontroller = fleurService.SeeAllFlowers();
        modelMap.addAttribute("fleursJsp",fleurcontroller);
        System.out.println(fleurcontroller.size());
        return "CreateBouquet";
    }
    @RequestMapping("saveBouquet")
    public String saveBouquet(@RequestParam("file") MultipartFile file,
                            @RequestParam("typebouquet") String typebouquet)
    {

        if(typebouquet.equals("ROND") ) { bouquetService.addbouquet(file,BouquetType.ROND ); }
        else if(typebouquet.equals("PARALLELE") ) {bouquetService.addbouquet(file,BouquetType.PARALLELE ); }
        else if(typebouquet.equals("LONGS") ) {bouquetService.addbouquet(file,BouquetType.LONGS ); }

        return "CreateBouquet";
    }

    @RequestMapping("/bouquetList")
    public String fleurList(ModelMap modelMap){
        List<Bouquet> bouquetController = bouquetService.SeeAllBouquet();
        modelMap.addAttribute("bouquetsJsp",bouquetController);
        //this is the name of the jsp file
        return "bouquetList";
    }

    @RequestMapping("/deleteBouquet")
    public String deleteBouquet(@RequestParam("id") Long id,ModelMap modelMap){
        bouquetService.deletebouquet(id);
        List<Bouquet> bouquetController = bouquetService.SeeAllBouquet();
        modelMap.addAttribute("bouquetsJsp",bouquetController);
        //this is the name of the jsp file
        return "bouquetList";
    }
}
