package ma.emsi.ormspringdata;

import ma.emsi.ormspringdata.entities.Patient;
import ma.emsi.ormspringdata.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class OrmSpringDataApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patient;
    public static void main(String[] args) {
        SpringApplication.run(OrmSpringDataApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patient.save(new Patient(null,"othman",new Date(), true, 198));
        patient.save(new Patient(null,"aya",new Date(), false, 56));
        patient.save(new Patient(null,"akram",new Date(), false, 87));
        patient.save(new Patient(null,"hatim",new Date(), false, 29));

        // Consulter tous les patients
        System.out.println("**************Liste Des Patients****************");
        patient.findAll().forEach(System.out::println);

        System.out.println("**************Patient avec l'Id 1 ***************");
        // Consulter un patient
        System.out.println(patient.findById(1L));

        System.out.println("**************Maj le Patient avec l'Id 2 ***************");
        // Mettre à jour un patient
        Patient p = patient.findById(2L).orElse(null);
        if (p != null)
        {
            p.setNom("ayaaaa");
            patient.save(p);
            System.out.println(patient.findById(2L));
        }

        System.out.println("**************Supprimer le Patient avec l'Id 3 ***************");
        // supprimer un patient
        patient.deleteById(3L);
        patient.findAll().forEach(System.out::println);
    }
}
