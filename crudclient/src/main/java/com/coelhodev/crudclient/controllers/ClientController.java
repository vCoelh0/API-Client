package com.coelhodev.crudclient.controllers;

import org.springframework.data.domain.Page;

import java.net.URI;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.coelhodev.crudclient.dto.ClientDTO;
import com.coelhodev.crudclient.services.ClientService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

	@Autowired
	private ClientService service;
	
	@GetMapping()
	public ResponseEntity< Page <ClientDTO>> findAll(Pageable pageable){
		Page<ClientDTO> dto = service.findAll(pageable);
		return ResponseEntity.ok(dto);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ClientDTO>  findById(@PathVariable Long id) {
			ClientDTO dto = service.findById(id);
			return ResponseEntity.ok(dto);
		
	}
	
	@PostMapping()
	public ResponseEntity<ClientDTO> insert (@Valid @RequestBody ClientDTO dto) {
		dto = service.insert(dto);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		
		return ResponseEntity.created(uri).body(dto);
	}
	
	@PutMapping("/{id}")
	public ClientDTO update(@PathVariable Long id, @Valid @RequestBody ClientDTO dto) {
		dto = service.update(id, dto);
		return dto;
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable Long id) {
		service.delete(id);
	}
	
	
	
		
}
