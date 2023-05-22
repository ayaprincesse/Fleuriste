package com.flowershop.flowershop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.flowershop.flowershop.entities.Client;

@Repository
public interface ClientRepo extends JpaRepository<Client,Long> {
}
