package com.flowershop.flowershop.repositories;

import com.flowershop.flowershop.entities.Fleur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FleurRepo extends JpaRepository<Fleur, Long> {
        }
