package com.api.clinicamedica.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.clinicamedica.models.PessoaModel;

@Service
public class PessoaService {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public PessoaModel salvar(PessoaModel pessoaModel) {
		entityManager.persist(pessoaModel);
		return pessoaModel;
	}
	
	public Object getCodigoPessoa(PessoaModel pessoaModel) {
		String nome = pessoaModel.getNome();

		Query query = entityManager.createNativeQuery("SELECT codigo FROM pessoa WHERE nome =  ?");  
		query.setParameter(1, nome);  
		Object test = query.getSingleResult();
 
		return test;
	}

}
