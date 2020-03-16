package com.kcomt.service;

import com.kcomt.entities.Plans;

public interface IPlansService extends CrudService<Plans>{

	public Plans findPlansbyClientDNI(String dni);
}
