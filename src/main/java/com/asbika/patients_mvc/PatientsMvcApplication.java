package com.asbika.patients_mvc;

import com.asbika.patients_mvc.entities.Patients;
import com.asbika.patients_mvc.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcApplication.class, args);
    }
    @Bean//cette methode va executer automatiquement au demarage de l 'application.
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args ->{
//            patientRepository.save(new Patients(null,"Hassan",new Date(),false,12));
//            patientRepository.save(new Patients(null,"Mohamed",new Date(),false,12));
//            patientRepository.save(new Patients(null,"Yasmine",new Date(),false,12));
//            patientRepository.save(new Patients(null,"Hanae",new Date(),false,12));

            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });
        };
    }
}
