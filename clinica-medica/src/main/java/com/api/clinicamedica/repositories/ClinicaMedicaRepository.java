package com.api.clinicamedica.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.clinicamedica.models.BaseDeEnderecosModel;

@Repository
public interface ClinicaMedicaRepository extends JpaRepository<BaseDeEnderecosModel, UUID> {

}
