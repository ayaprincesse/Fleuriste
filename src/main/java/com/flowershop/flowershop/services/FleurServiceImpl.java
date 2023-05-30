package com.flowershop.flowershop.services;

import com.flowershop.flowershop.entities.Fleur;
import com.flowershop.flowershop.repositories.FleurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

@Service
public class FleurServiceImpl implements FleurService{
    @Autowired
    FleurRepo fleurRepository;
    @Override
    public Fleur saveFleur(MultipartFile imageFleur, String nomFleur, String couleurFleur, Long prixFleur) {
        Fleur f = new Fleur();
        String fileName = StringUtils.cleanPath(imageFleur.getOriginalFilename());
        if(fileName.contains(".."))
        {
            System.out.println("not a a valid file");
        }
        try {
            f.setImageFleur(Base64.getEncoder().encodeToString(imageFleur.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        f.setNomFleur(nomFleur);
        f.setCouleurFleur(couleurFleur);
        f.setPrixFleur(prixFleur);

        return fleurRepository.save(f);
    }

    @Override
    public Fleur UpdateFlower(Fleur fleur ) {
        return fleurRepository.save(fleur);
    }

    @Override
    public void DeleteFlower(Long idFleur) {
        fleurRepository.deleteById(idFleur);
    }

    @Override
    public Fleur GetFlowerById(Long id) {
        return fleurRepository.findById(id).get();
    }

    @Override
    public List<Fleur> SeeAllFlowers() {
        return fleurRepository.findAll();
    }

    @Override
    public Page<Fleur> getallflowersbypage(int page, int size) {
        return fleurRepository.findAll(PageRequest.of(page,size));
    }

}
