package com.bootcamp.ServCliente.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.ServCliente.Model.ClienteEmpresa;
import com.bootcamp.ServCliente.Repository.ClienteEmpresaRepository;

@RestController
@RequestMapping("/api")
public class ClienteEmpresaController {
	
	@Autowired
	ClienteEmpresaRepository clienteEmpresaRepository;
	
	@PostMapping("/ClienteEmpresa")
	public ResponseEntity<ClienteEmpresa> createClienteEmpresa(@RequestBody ClienteEmpresa clienteEmpresa){
		try {
			ClienteEmpresa _clienteEmpresa = clienteEmpresaRepository.save(new ClienteEmpresa(clienteEmpresa.getNomEmpresa(), clienteEmpresa.getRuc(),
					clienteEmpresa.getRepLegal(),clienteEmpresa.getDniRep(),clienteEmpresa.getDirEmpresa(),clienteEmpresa.getTelfEmpresa(),
					clienteEmpresa.getCorreoEmpresa(), clienteEmpresa.getCorreoRep()));
			return new ResponseEntity<>(_clienteEmpresa, HttpStatus.ACCEPTED);
		}catch(Exception e) {
			return new ResponseEntity<>(null,HttpStatus.EXPECTATION_FAILED);
		}
	}
	
	@PutMapping("/ClienteEmpresa/{id}")
	public ResponseEntity<ClienteEmpresa> updateClienteEmpresa(@PathVariable("id") String id, @RequestBody ClienteEmpresa clienteEmpresa){
		Optional<ClienteEmpresa> EmpresaData = clienteEmpresaRepository.findById(id);
		
		if(EmpresaData.isPresent()) {
			ClienteEmpresa _ClienteEmpresa = EmpresaData.get();
			_ClienteEmpresa.setNomEmpresa(clienteEmpresa.getNomEmpresa());
			_ClienteEmpresa.setRuc(clienteEmpresa.getRuc());
			_ClienteEmpresa.setRepLegal(clienteEmpresa.getRepLegal());
			_ClienteEmpresa.setDniRep(clienteEmpresa.getDniRep());
			_ClienteEmpresa.setDirEmpresa(clienteEmpresa.getDirEmpresa());
			_ClienteEmpresa.setTelfEmpresa(clienteEmpresa.getTelfEmpresa());
			_ClienteEmpresa.setCorreoEmpresa(clienteEmpresa.getCorreoEmpresa());
			_ClienteEmpresa.setCorreoRep(clienteEmpresa.getCorreoRep());
			
			return new ResponseEntity<> (clienteEmpresaRepository.save(clienteEmpresa), HttpStatus.ACCEPTED);
		}else {
			return new ResponseEntity<> (null, HttpStatus.EXPECTATION_FAILED);
		}
	}
	
	@GetMapping("/ClienteEmpresa")
	public ResponseEntity<List<ClienteEmpresa>> getAllClienteEmpresa(@RequestParam(required = false) String ruc){
		try {
			List<ClienteEmpresa> clienteEmpresa = new ArrayList<ClienteEmpresa>();
			
			if(ruc == null)
				clienteEmpresaRepository.findAll().forEach(clienteEmpresa::add);
			else
				clienteEmpresaRepository.findByRuc(ruc).forEach(clienteEmpresa::add);
			if(clienteEmpresa.isEmpty())
				return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
			
			return new ResponseEntity<>(clienteEmpresa, HttpStatus.ACCEPTED);
		}catch(Exception e) {
			return new ResponseEntity<> (null,HttpStatus.EXPECTATION_FAILED);
		}
	}

}
