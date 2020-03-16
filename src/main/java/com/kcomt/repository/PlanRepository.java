package com.kcomt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kcomt.entities.Plans;

@Repository
public interface PlanRepository extends JpaRepository<Plans, Integer>{

	@Query("select f from Plans f where f.client.dni=?1")
	Plans findPlansbyClientDNI(String dni);
}
