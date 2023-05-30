package com.flowershop.flowershop.services;

import com.flowershop.flowershop.entities.Administrateurs;
import com.flowershop.flowershop.repositories.AdministrateurRepo;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    AdministrateurRepo administrateurRepository;
    @Override
    public Administrateurs saveAdmin(Administrateurs admin) {
        return administrateurRepository.save(admin);
    }

    @Override
    public Administrateurs updateAdmin(Administrateurs admin) {
        return  administrateurRepository.save(admin);
    }

    @Override
    public Administrateurs getAdmin(Long id) {
        return  administrateurRepository.findById(id).get();
    }

   // @Override
   // public Administrateurs getAdminByData(String username) {
   //     return administrateurRepository.findByUsername(username);
   // }

    @Override
    public void deleteAdminById(Long id) {
        administrateurRepository.deleteById(id);
    }
}
