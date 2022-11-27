package com.api.clinicamedica.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.clinicamedica.models.BaseDeEnderecosModel;
import com.api.clinicamedica.models.FuncionarioModel;
import com.api.clinicamedica.models.MedicoModel;
import com.api.clinicamedica.models.PacienteModel;

@Service
public class MedicoService {
	

	 @PersistenceContext
	  private EntityManager entityManager;

   @Transactional
	public MedicoModel salvar(MedicoModel medicoModel) {
   	
	   entityManager.persist(medicoModel);
	   
		return medicoModel;
	}
   
   public List<FuncionarioModel> findAll() {
		String jpql = "SELECT p FROM FuncionarioModel p";
		TypedQuery<FuncionarioModel> query = entityManager.createQuery(jpql, FuncionarioModel.class);
		List<FuncionarioModel> test = query.getResultList();
		return test;
	}

}
