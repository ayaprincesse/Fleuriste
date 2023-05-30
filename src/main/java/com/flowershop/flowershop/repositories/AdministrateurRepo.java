package com.flowershop.flowershop.repositories;

import com.flowershop.flowershop.entities.Administrateurs;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministrateurRepo extends JpaRepository<Administrateurs,Long> {
    //Administrateurs findByUsername(String username);
}
