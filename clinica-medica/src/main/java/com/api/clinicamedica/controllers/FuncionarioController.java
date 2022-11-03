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
import com.api.clinicamedica.DTO.PessoaFuncionarioMedicoDTO;
import com.api.clinicamedica.DTO.PessoaPacienteDTO;
import com.api.clinicamedica.models.BaseDeEnderecosModel;
import com.api.clinicamedica.models.FuncionarioModel;
import com.api.clinicamedica.models.MedicoModel;
import com.api.clinicamedica.models.PacienteModel;
import com.api.clinicamedica.models.PessoaModel;
import com.api.clinicamedica.services.ClinicaMedicaService;
import com.api.clinicamedica.services.FuncionarioService;
import com.api.clinicamedica.services.PacienteService;
import com.api.clinicamedica.services.PessoaService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/funcionario")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class FuncionarioController {
	
	 final FuncionarioService funcionarioService;
	 final PessoaService pessoaService;

	  public FuncionarioController(FuncionarioService funcionarioService, PessoaService pessoaService) {
	        this.funcionarioService = funcionarioService;
			this.pessoaService = pessoaService;
	    }
	    

	    @PostMapping
	    public ResponseEntity<Object> saveFuncionario(@RequestBody @Valid PessoaFuncionarioMedicoDTO pessoaFuncionarioMedicoDTO){

	        FuncionarioModel funcionarioModel = new FuncionarioModel();
	        PessoaModel pessoaModel = new PessoaModel();
	        MedicoModel medicoModel = new MedicoModel();
	        
	        BeanUtils.copyProperties(pessoaFuncionarioMedicoDTO, funcionarioModel);
	        BeanUtils.copyProperties(pessoaFuncionarioMedicoDTO, pessoaModel);
	        BeanUtils.copyProperties(pessoaFuncionarioMedicoDTO, medicoModel);
	     //continuar
	        //pessoaService.salvar(pessoaModel);
	       // Object codigo = pessoaService.getCodigoPessoa(pessoaModel);
	        //pacienteModel.setPessoa(pessoaModel);
	       // pacienteService.salvar(pacienteModel);
    
	        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.salvar(pessoaModel));
	    } 
	    
	   // @GetMapping
	   // public ResponseEntity<Object> getAllParkingSpots(){
	        //return ResponseEntity.status(HttpStatus.OK).body(pessoaService.findAll());
	   // }
	    
	    

}
