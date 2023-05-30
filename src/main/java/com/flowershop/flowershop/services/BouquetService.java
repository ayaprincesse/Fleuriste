package com.flowershop.flowershop.services;

import com.flowershop.flowershop.entities.Bouquet;
import com.flowershop.flowershop.entities.BouquetType;
import com.flowershop.flowershop.entities.Fleur;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public interface BouquetService {
    Bouquet addbouquet(MultipartFile Image, BouquetType typebouquet);
    Bouquet updatebouquet(Bouquet bouquet);
    void deletebouquet(Long Id);
    Bouquet getbouquetbyid(Long Id);
    List<Bouquet> SeeAllBouquet();
    Page<Bouquet> getallflowersbypage(int page, int size);
}