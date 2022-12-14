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

import com.api.clinicamedica.DTO.BaseDeEnderecosDTO;
import com.api.clinicamedica.DTO.PessoaPacienteDTO;
import com.api.clinicamedica.models.BaseDeEnderecosModel;
import com.api.clinicamedica.models.PacienteModel;
import com.api.clinicamedica.models.PessoaModel;
import com.api.clinicamedica.services.PacienteService;
import com.api.clinicamedica.services.PessoaService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/paciente")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PacienteController {
	
	 final PacienteService pacienteService;
	 final PessoaService pessoaService;

	  public PacienteController(PacienteService pacienteService, PessoaService pessoaService) {
	        this.pacienteService = pacienteService;
			this.pessoaService = pessoaService;
	    }
	    

	    @PostMapping
	    public ResponseEntity<Object> savePaciente(@RequestBody @Valid PessoaPacienteDTO pessoaPacienteDTO){

	        PacienteModel pacienteModel = new PacienteModel();
	        PessoaModel pessoaModel = new PessoaModel();
	        
	        BeanUtils.copyProperties(pessoaPacienteDTO, pacienteModel);
	        BeanUtils.copyProperties(pessoaPacienteDTO, pessoaModel);
	     
	        pessoaService.salvar(pessoaModel);
	       // Object codigo = pessoaService.getCodigoPessoa(pessoaModel);
	        pacienteModel.setPessoa(pessoaModel);
    
	        return ResponseEntity.status(HttpStatus.CREATED).body( pacienteService.salvar(pacienteModel));
	    } 
	    
	    @GetMapping
	    public ResponseEntity<Object> getAll(){
	        return ResponseEntity.status(HttpStatus.OK).body(pacienteService.findAll());
	    }
	    
	    

}
