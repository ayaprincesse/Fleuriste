package com.flowershop.flowershop.services;

import org.springframework.stereotype.Service;
import com.flowershop.flowershop.entities.Bouquet;
import com.flowershop.flowershop.entities.BouquetType;
import com.flowershop.flowershop.entities.Fleur;
import com.flowershop.flowershop.repositories.BouquetRepo;
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
public class BouquetServiceImpl implements BouquetService{

    @Autowired
    BouquetRepo bouquetRepository;

    @Override
    public Bouquet addbouquet(MultipartFile Image, BouquetType typebouquet) {

        Bouquet b = new Bouquet(typebouquet);

        String fileName = StringUtils.cleanPath(Image.getOriginalFilename());
        if (fileName.contains("..")) {
            System.out.println("not a a valid file");
        }
        try {
            b.setImage(Base64.getEncoder().encodeToString(Image.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bouquetRepository.save(b);

    }
    @Override
    public Bouquet updatebouquet(Bouquet bouquet) {
        return bouquetRepository.save(bouquet);
    }

    @Override
    public void deletebouquet(Long Id) {
        bouquetRepository.deleteById(Id);
    }

    @Override
    public Bouquet getbouquetbyid(Long Id) {
        return bouquetRepository.findById(Id).get();
    }

    @Override
    public List<Bouquet> SeeAllBouquet() {
        return bouquetRepository.findAll();
    }

    @Override
    public Page<Bouquet> getallflowersbypage(int page, int size) {
        return bouquetRepository.findAll(PageRequest.of(page,size));
    }
}

