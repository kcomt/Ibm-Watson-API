package com.kcomt.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kcomt.entities.Plans;
import com.kcomt.service.IPlansService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/plans")
@Api(value="REST review")
public class PlanController {

	@Autowired
	private IPlansService plansService;
	
	@ApiOperation("Obtener balance por dni de cliente")
	@GetMapping(value = "/client/{dni}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Plans> fetchbuisnessOwner(@PathVariable("dni") String dni) {

		try {
			Plans bO = plansService.findPlansbyClientDNI(dni);
			return new ResponseEntity<Plans>(bO, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Plans>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
