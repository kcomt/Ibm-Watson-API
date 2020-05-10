package com.kcomt.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kcomt.entities.Plans;
import com.kcomt.repository.PlanRepository;
import com.kcomt.service.IPlansService;

@Service
public class PlansServiceImpl implements IPlansService{

	@Autowired
	private PlanRepository planRepository;

	@Override
	public List<Plans> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Plans save(Plans t) throws Exception {
		return planRepository.save(t);
	}

	@Override
	public Plans update(Plans t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Plans> findById(Integer id) throws Exception {
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
	
	@Transactional(readOnly = true)
	@Override
	public Plans findPlansbyClientDNI(String dni) {
		return planRepository.findPlansbyClientDNI(dni);
	}
	
}
