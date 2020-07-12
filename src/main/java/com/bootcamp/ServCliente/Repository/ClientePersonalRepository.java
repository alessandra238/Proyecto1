package com.bootcamp.ServCliente.Repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bootcamp.ServCliente.Model.ClientePersonal;

public interface ClientePersonalRepository extends MongoRepository<ClientePersonal, String> {

	List<ClientePersonal> findByID(String idPersona);
	List<ClientePersonal> findByDocIdent(String docIdent);
}
