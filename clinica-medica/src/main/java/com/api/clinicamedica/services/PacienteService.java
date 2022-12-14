package com.api.clinicamedica.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

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
   
   public List<PacienteModel> findAll() {
		String jpql = "SELECT p FROM PacienteModel p";
		TypedQuery<PacienteModel> query = entityManager.createQuery(jpql, PacienteModel.class);
		List<PacienteModel> test = query.getResultList();
		return test;
	}
   
   public Object findUsuario(String email,String senha) {

		Query query = entityManager.createNativeQuery(""
				+ "select pe.nome from funcionario f\r\n"
				+ "join pessoa pe on f.codigo = pe.codigo \r\n"
				+ "where f.senha_hash = ? and pe.email = ?");
		query.setParameter(1, senha);
		query.setParameter(2, email);
		
		Object test = query.getResultList();
		
		if(ObjectUtils.isEmpty(test)) {
			return "Não";
		}
		return test;
	}

}
