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
import com.api.clinicamedica.models.BaseDeEnderecosModel;
import com.api.clinicamedica.services.EnderecoService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/endereco")
public class EnderecoController {
	
	 final EnderecoService enderecoService;

	    public EnderecoController(EnderecoService enderecoService) {
	        this.enderecoService = enderecoService;
	    }
	    
	    @PostMapping
	    public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid BaseDeEnderecosDTO baseDeEnderecoDTO){

	        BaseDeEnderecosModel baseDeEnderecosModel = new BaseDeEnderecosModel();
	        BeanUtils.copyProperties(baseDeEnderecoDTO, baseDeEnderecosModel);
	        
	        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoService.salvar(baseDeEnderecosModel));
	    } 
	    
	    @GetMapping
	    public ResponseEntity<Object> getAll(){
	        return ResponseEntity.status(HttpStatus.OK).body(enderecoService.findAll());
	    }
	    
	    

}
