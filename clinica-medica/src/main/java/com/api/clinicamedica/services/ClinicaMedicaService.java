package com.api.clinicamedica.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.clinicamedica.models.BaseDeEnderecosModel;
import com.api.clinicamedica.repositories.ClinicaMedicaRepository;

@Service
public class ClinicaMedicaService {
	
	final ClinicaMedicaRepository clinicaMedicaRepository;

    public ClinicaMedicaService(ClinicaMedicaRepository clinicaMedicaRepository) {
        this.clinicaMedicaRepository = clinicaMedicaRepository;
    }

    @Transactional
	public BaseDeEnderecosModel save(BaseDeEnderecosModel baseDeEnderecosModel) {
		return clinicaMedicaRepository.save(baseDeEnderecosModel);
	}

}
