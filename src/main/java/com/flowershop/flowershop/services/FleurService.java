package com.flowershop.flowershop.services;

import com.flowershop.flowershop.entities.Fleur;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public interface FleurService {
    Fleur saveFleur(MultipartFile file, String nom, String couleur
            , Long prix);
    Fleur updateFleur(Fleur f);
    Fleur getFleur(Long id);
    List<Fleur> getAllFleurs();
    void deleteFleurById(Long id);
}
