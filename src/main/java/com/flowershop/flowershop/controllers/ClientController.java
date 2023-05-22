package com.flowershop.flowershop.controllers;

import com.flowershop.flowershop.entities.Client;
import com.flowershop.flowershop.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClientController {
    @Autowired
    ClientService clientService;

    @RequestMapping("/CreateClient")
    public String CreateClient(){
        return "CreateClient";
    }
    @RequestMapping("saveClient")
    public String saveClient(@ModelAttribute("client")Client client){
        clientService.saveClient(client);
        return "CreateClient";
    }
}
