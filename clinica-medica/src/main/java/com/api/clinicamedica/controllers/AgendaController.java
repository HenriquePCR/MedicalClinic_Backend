package com.api.clinicamedica.controllers;


import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.clinicamedica.DTO.AgendaDTO;
import com.api.clinicamedica.DTO.BaseDeEnderecosDTO;
import com.api.clinicamedica.DTO.PessoaFuncionarioMedicoDTO;
import com.api.clinicamedica.DTO.PessoaPacienteDTO;
import com.api.clinicamedica.models.AgendaModel;
import com.api.clinicamedica.models.BaseDeEnderecosModel;
import com.api.clinicamedica.models.FuncionarioModel;
import com.api.clinicamedica.models.MedicoModel;
import com.api.clinicamedica.models.PacienteModel;
import com.api.clinicamedica.models.PessoaModel;
import com.api.clinicamedica.services.MedicoService;
import com.api.clinicamedica.services.PacienteService;
import com.api.clinicamedica.services.PessoaService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/agenda")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AgendaController {
	
//	 final PacienteService pacienteService;
//	 final PessoaService pessoaService;
	 final MedicoService medicoService;

	  public AgendaController(PacienteService pacienteService, PessoaService pessoaService, MedicoService medicoService) {
//	        this.pacienteService = pacienteService;
//			this.pessoaService = pessoaService;
			this.medicoService = medicoService;
	    }
	    

//	    @PostMapping
//	    public ResponseEntity<Object> saveAgenda(@RequestBody @Valid PessoaPacienteDTO pessoaPacienteDTO){
//
//	    } 
	    
	    @GetMapping(value = "/medicos")
	    public ResponseEntity<Object> getAllMedicos(){
	        return ResponseEntity.status(HttpStatus.OK).body(medicoService.findAll());
	    }
	    
	    @GetMapping
	    public ResponseEntity<Object> getAllAgenda(){
	        return ResponseEntity.status(HttpStatus.OK).body(medicoService.findAllAgenda());
	    }
	    
	    @PostMapping
		public ResponseEntity<Object> saveFuncionario(
				@RequestBody @Valid AgendaDTO agendaDTO) {

			AgendaModel agendaModel = new AgendaModel();
			
//			MedicoModel medicoModel = medicoService.find(agendaDTO.getCodigo());
//
//			agendaModel.setMedico(medicoModel);
		
	        return ResponseEntity.status(HttpStatus.CREATED).body( medicoService.salvarAgenda(agendaModel));



		}
	    
	    

}
