package com.api.clinicamedica.controllers;


import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.clinicamedica.DTO.LoginDTO;
import com.api.clinicamedica.DTO.PessoaPacienteDTO;
import com.api.clinicamedica.services.PacienteService;
import com.api.clinicamedica.services.PessoaService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/login")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class LoginController {
	
	 final PacienteService pacienteService;
	 final PessoaService pessoaService;

	  public LoginController(PacienteService pacienteService, PessoaService pessoaService) {
	        this.pacienteService = pacienteService;
			this.pessoaService = pessoaService;
	    }
	    
	  @PostMapping
	    public ResponseEntity<Object> getUser(@RequestBody @Valid LoginDTO loginDTO){
	        return ResponseEntity.status(HttpStatus.OK).body(pacienteService.findUsuario(loginDTO.getEmail(),loginDTO.getSenha()));
	    }
	    

   

}
