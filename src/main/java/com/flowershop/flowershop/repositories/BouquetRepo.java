package com.flowershop.flowershop.repositories;

import com.flowershop.flowershop.entities.Bouquet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BouquetRepo extends JpaRepository<Bouquet,Long> {
}
