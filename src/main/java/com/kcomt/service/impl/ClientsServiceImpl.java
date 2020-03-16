package com.kcomt.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.kcomt.entities.Clients;
import com.kcomt.repository.ClientRepository;
import com.kcomt.repository.PlanRepository;
import com.kcomt.service.IClientsService;

public class ClientsServiceImpl implements IClientsService{

	@Autowired
	private ClientRepository clientsRepository;
	
	@Override
	public List<Clients> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Clients save(Clients t) throws Exception {
		return clientsRepository.save(t);
	}

	@Override
	public Clients update(Clients t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Clients> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
