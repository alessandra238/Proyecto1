package com.bootcamp.ServCliente.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bootcamp.ServCliente.Model.ClienteEmpresa;

public interface ClienteEmpresaRepository extends MongoRepository<ClienteEmpresa, String>{

	List<ClienteEmpresa> findByRuc(String ruc);
}
