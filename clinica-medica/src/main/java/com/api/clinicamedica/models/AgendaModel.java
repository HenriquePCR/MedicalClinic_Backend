package com.api.clinicamedica.models;


import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "agenda")
@SequenceGenerator(name = "SEQ_AGENDA", sequenceName = "SEQ" ,initialValue = 1, allocationSize = 1)
public class AgendaModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_AGENDA")
	@Column(name = "codigo_medico")
	private Long codigo_medico;
	
	@Column(name = "data", nullable = true, length = 50)
	private LocalDate data;
	
	@Column(name = "horario", nullable = true, length = 50)
	private String horario;
	
	@Column(name = "nome", nullable = true, length = 50)
	private String nome;
	
	@Column(name = "email", nullable = true, length = 250)
	private String email;
	
	@Column(name = "telefone", length = 14, nullable = true)
	private String telefone;
	
	 @ManyToOne
	 @JoinColumn(name = "codigo")
	 private MedicoModel medico;
	
	
}
