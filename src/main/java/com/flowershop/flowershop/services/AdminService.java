package com.flowershop.flowershop.services;

import com.flowershop.flowershop.entities.Administrateurs;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {
    Administrateurs saveAdmin(Administrateurs admin);
    Administrateurs updateAdmin(Administrateurs admin);
    Administrateurs getAdmin(Long id);
    Administrateurs getAdminByData(String username);
    void deleteAdminById(Long id);
}
