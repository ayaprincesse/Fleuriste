package com.flowershop.flowershop.services;

import com.flowershop.flowershop.entities.Fleur;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.data.domain.Page;

import java.util.List;

@Service
public interface FleurService {
    Fleur saveFleur(MultipartFile imageFleur, String nomFleur, String couleurFleur, Long prixFleur);
    Fleur UpdateFlower(Fleur fleur);
    void DeleteFlower(Long idFleur);
    Fleur GetFlowerById(Long id);
    List<Fleur> SeeAllFlowers();
    Page<Fleur>getallflowersbypage(int page, int size);
}
