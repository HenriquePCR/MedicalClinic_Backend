package com.api.clinicamedica.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.clinicamedica.models.AgendaModel;
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
   
   public List<MedicoModel> findAll() {
		String jpql = "SELECT p FROM MedicoModel p";
		TypedQuery<MedicoModel> query = entityManager.createQuery(jpql, MedicoModel.class);
		List<MedicoModel> test = query.getResultList();
		return test;
	}
   
   public MedicoModel find(Long codigo) {

		Query query = entityManager.createNativeQuery("SELECT p FROM MedicoModel p WHERE p.codigo =  ?");
		query.setParameter(1, codigo);
		MedicoModel test = (MedicoModel) query.getResultList();

		return test;
	}
   
   public List<AgendaModel> findAllAgenda() {
 		String jpql = "select p from AgendaModel p";
		TypedQuery<AgendaModel> query = entityManager.createQuery(jpql, AgendaModel.class);
 		List<AgendaModel> test = query.getResultList();
 		return test;
   }
   
   @Transactional
 	public AgendaModel salvarAgenda(AgendaModel agendaModel) {
 	   entityManager.persist(agendaModel);
 		return agendaModel;
 	}
    
   
}
