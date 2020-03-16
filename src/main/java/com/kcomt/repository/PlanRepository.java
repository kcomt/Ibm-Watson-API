package com.kcomt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kcomt.entities.Plans;

@Repository
public interface PlanRepository extends JpaRepository<Plans, Integer>{

}
