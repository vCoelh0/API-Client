package com.coelhodev.crudclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coelhodev.crudclient.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
