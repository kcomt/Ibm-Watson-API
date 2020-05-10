package com.kcomt.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.kcomt.entities.Clients;
import com.kcomt.entities.Plans;
import com.kcomt.service.IClientsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/clients")
@Api(value="REST review")
public class ClientController {
	
	@Autowired
	private IClientsService clientsService;
	
	@ApiOperation("Registro de clientes")
	@PostMapping(consumes= MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> saveSale(@Valid @RequestBody Clients clients)
	{
		try {
			Clients hor = new Clients();
			hor= clientsService.save(clients);
			
			URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(hor.getId()).toUri();
			
			return ResponseEntity.created(location).build();
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
					
		}
	}
	
	@ApiOperation("Listar todo los clientes")
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Clients>> fetchStudents() {
		try {
			List<Clients> students = new ArrayList<>();
			students = clientsService.findAll();
			return new ResponseEntity<List<Clients>>(students, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<Clients>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
