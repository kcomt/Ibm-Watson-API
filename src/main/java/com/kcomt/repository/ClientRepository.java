package com.kcomt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kcomt.entities.Clients;

@Repository
public interface ClientRepository extends JpaRepository<Clients, Integer>{

}
