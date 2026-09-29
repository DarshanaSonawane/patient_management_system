package org.example.microservice.repository;


import org.example.microservice.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PatientRepository extends JpaRepository<Patient, UUID> {

    @Override
    boolean existsById(UUID  id);

    boolean existsByEmail(String email);
    boolean existsByEmailAndIdNot(String email, UUID id);
}
