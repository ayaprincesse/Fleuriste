package com.flowershop.flowershop.services;

import com.flowershop.flowershop.entities.Fleur;
import com.flowershop.flowershop.repositories.FleurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

@Service
public class FleurServiceImpl implements FleurService{
    @Autowired
    FleurRepo fleurrepository;

    @Override
    public Fleur saveFleur(MultipartFile file, String nom, String couleur
            , Long prix) {
      //  return fleurrepository.save(f);
        Fleur f = new Fleur();
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        if(fileName.contains(".."))
        {
            System.out.println("not a a valid file");
        }
        try {
            f.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        f.setNom(nom);
        f.setCouleur(couleur);
        f.setPrix(prix);

        return fleurrepository.save(f);
    }



    @Override
    public Fleur updateFleur(Fleur f) {
        return fleurrepository.save(f);
    }

    @Override
    public Fleur getFleur(Long id) {
        return fleurrepository.findById(id).get();
    }

    @Override
    public List<Fleur> getAllFleurs() {
        return fleurrepository.findAll();
    }

    @Override
    public void deleteFleurById(Long id) {
        fleurrepository.deleteById(id);
    }
}
