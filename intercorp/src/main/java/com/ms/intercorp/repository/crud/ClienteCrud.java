package com.ms.intercorp.repository.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.intercorp.model.Cliente;

public interface ClienteCrud extends JpaRepository<Cliente, Integer>{

}
