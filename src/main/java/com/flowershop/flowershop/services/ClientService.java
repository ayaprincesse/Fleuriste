package com.flowershop.flowershop.services;

import com.flowershop.flowershop.entities.Client;
import com.flowershop.flowershop.entities.Fleur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {
    Client saveClient(Client client);
    Client updateClient(Client client);
    Client getClient(Long id);
    List<Client> getAllClients();
    void deleteClientById(Long id);
}
