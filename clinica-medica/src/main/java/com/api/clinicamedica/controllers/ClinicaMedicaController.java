package com.api.clinicamedica.controllers;


import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.clinicamedica.DTO.BaseDeEnderecosDTO;
import com.api.clinicamedica.models.BaseDeEnderecosModel;
import com.api.clinicamedica.services.ClinicaMedicaService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/clinica-medica")
public class ClinicaMedicaController {
	
	 final ClinicaMedicaService clinicaMedicaService;

	    public ClinicaMedicaController(ClinicaMedicaService clinicaMedicaService) {
	        this.clinicaMedicaService = clinicaMedicaService;
	    }
	    
	    @PostMapping
	    public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid BaseDeEnderecosDTO baseDeEnderecoDTO){
	        /*if(clinicaMedicaService.existsByLicensePlateCar(parkingSpotDto.getLicensePlateCar())){
	            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: License Plate Car is already in use!");
	        }
	        if(clinicaMedicaService.existsByParkingSpotNumber(parkingSpotDto.getParkingSpotNumber())){
	            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Parking Spot is already in use!");
	        }
	        if(clinicaMedicaService.existsByApartmentAndBlock(parkingSpotDto.getApartment(), parkingSpotDto.getBlock())){
	            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: Parking Spot already registered for this apartment/block!");
	        }
	        */
	        BaseDeEnderecosModel baseDeEnderecosModel = new BaseDeEnderecosModel();
	        BeanUtils.copyProperties(baseDeEnderecoDTO, baseDeEnderecosModel);
	        //baseDeEnderecosModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
	        return ResponseEntity.status(HttpStatus.CREATED).body(clinicaMedicaService.save(baseDeEnderecosModel));
	    } 
	    
	    

}
