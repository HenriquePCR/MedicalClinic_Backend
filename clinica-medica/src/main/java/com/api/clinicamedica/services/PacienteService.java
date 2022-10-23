package com.api.clinicamedica.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.clinicamedica.models.BaseDeEnderecosModel;
import com.api.clinicamedica.models.PacienteModel;

@Service
public class PacienteService {
	

	 @PersistenceContext
	  private EntityManager entityManager;

   @Transactional
	public PacienteModel salvar(PacienteModel pacienteModel) {
   	
	   entityManager.persist(pacienteModel);
   	 
		return pacienteModel;
	}

}
