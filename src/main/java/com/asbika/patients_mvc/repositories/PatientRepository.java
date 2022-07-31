package com.asbika.patients_mvc.repositories;

import com.asbika.patients_mvc.entities.Patients;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patients,Long> {

   Page<Patients> findByNomContains(String kw, Pageable pageable);

}
