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

import com.bootcamp.ServCliente.Model.ClientePersonal;
import com.bootcamp.ServCliente.Repository.ClientePersonalRepository;

@RestController
@RequestMapping("/api")
public class ClientePersonalController {

	@Autowired
	ClientePersonalRepository clientePersonalRepository;
	
	@PostMapping("/ClientePersonal")
	public ResponseEntity<ClientePersonal> createClientePersonal(@RequestBody ClientePersonal clientePersonal){
		try {
			ClientePersonal _ClientePersonal = clientePersonalRepository.save(new ClientePersonal(clientePersonal.getNomCliente(), clientePersonal.getApeCliente(), clientePersonal.getDocIdent(), clientePersonal.getTelefono(), clientePersonal.getDirCliente(),clientePersonal.getCorreoCliente()));
			return new ResponseEntity<>(_ClientePersonal, HttpStatus.ACCEPTED);
		}catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
	}
	
	@PutMapping("/ClientePersonal/{id}")
	public ResponseEntity<ClientePersonal> updateClientePersonal(@PathVariable("id") String id, @RequestBody ClientePersonal clientePersonal){
		Optional<ClientePersonal> PersonalData = clientePersonalRepository.findById(id);
		
		if(PersonalData.isPresent()) {
			ClientePersonal _ClientePersonal = PersonalData.get();
			_ClientePersonal.setNomCliente(clientePersonal.getNomCliente());
			_ClientePersonal.setApeCliente(clientePersonal.getApeCliente());
			_ClientePersonal.setDocIdent(clientePersonal.getDocIdent());
			_ClientePersonal.setTelefono(clientePersonal.getTelefono());
			_ClientePersonal.setDirCliente(clientePersonal.getDirCliente());
			_ClientePersonal.setCorreoCliente(clientePersonal.getCorreoCliente());
			
			return new ResponseEntity<> (clientePersonalRepository.save(_ClientePersonal), HttpStatus.ACCEPTED);
		}else {
			return new ResponseEntity<> (null, HttpStatus.NOT_FOUND);
		}		
	}
	
	@GetMapping("/ClientePersonal")
	public ResponseEntity<List<ClientePersonal>> getAllClientePersonal(@RequestParam(required =false) String dni){
		try {
			List<ClientePersonal> clientePersonal = new ArrayList<ClientePersonal>();
			
			if(dni == null)
				clientePersonalRepository.findAll().forEach(clientePersonal::add);
			else
				clientePersonalRepository.findByDocIdent(dni).forEach(clientePersonal::add);
			
			return new ResponseEntity<>(clientePersonal, HttpStatus.ACCEPTED);
		}catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		
		
	}
	
	
}
