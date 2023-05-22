package com.flowershop.flowershop.controllers;

import com.flowershop.flowershop.entities.Administrateurs;
import com.flowershop.flowershop.services.AdminService;
import com.flowershop.flowershop.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    @Autowired
    AdminService adminService;
    @RequestMapping("/LoginPageAdmin")
    public String LoginPageAdmin(){
        return "Login";
    }

    @RequestMapping("loginAdmin")
    public String loginAdmin(@RequestParam("username") String username, @RequestParam("password") String password){
        Administrateurs admin = adminService.getAdminByData(username);
        if (admin != null) {
            //admin Found
            if (admin.getPassword()!=password) { // wrong password
                return "Login";
            }
            else {
                    return "fleurList";
            }
        } else {
            return "Login";
        }

    }

}
