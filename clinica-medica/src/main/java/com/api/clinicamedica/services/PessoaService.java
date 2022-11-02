package com.api.clinicamedica.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.clinicamedica.models.PessoaModel;
import com.api.clinicamedica.models.PacienteModel;

@Service
public class PessoaService {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public PessoaModel salvar(PessoaModel pessoaModel) {
		entityManager.persist(pessoaModel);
		return pessoaModel;
	}
	
	public List<PacienteModel> findAll() {
		String jpql = "SELECT p FROM PacienteModel p";
		TypedQuery<PacienteModel> query = entityManager.createQuery(jpql, PacienteModel.class);
		List<PacienteModel> test = query.getResultList();
		return test;
	}

	public Object getCodigoPessoa(PessoaModel pessoaModel) {
		String nome = pessoaModel.getNome();

		Query query = entityManager.createNativeQuery("SELECT codigo FROM pessoa WHERE nome =  ?");
		query.setParameter(1, nome);
		Object test = query.getSingleResult();

		return test;
	}

}
