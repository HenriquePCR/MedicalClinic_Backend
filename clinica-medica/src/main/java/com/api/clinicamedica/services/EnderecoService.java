package com.api.clinicamedica.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.clinicamedica.models.BaseDeEnderecosModel;
import com.api.clinicamedica.models.FuncionarioModel;


@Service
public class EnderecoService {
	
	 @PersistenceContext
	  private EntityManager entityManager;

    @Transactional
	public BaseDeEnderecosModel salvar(BaseDeEnderecosModel baseDeEnderecosModel) {
    	
    	 entityManager.persist(baseDeEnderecosModel);
    	 
		return baseDeEnderecosModel;
	}
    
    public List<BaseDeEnderecosModel> findAll() {
		String jpql = "SELECT b FROM BaseDeEnderecosModel b";
		TypedQuery<BaseDeEnderecosModel> query = entityManager.createQuery(jpql, BaseDeEnderecosModel.class);
		List<BaseDeEnderecosModel> test = query.getResultList();
		return test;
	}

}
