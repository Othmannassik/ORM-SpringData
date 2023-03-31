package ma.emsi.ormspringdata;

import ma.emsi.ormspringdata.entities.Patient;
import ma.emsi.ormspringdata.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class OrmSpringDataApplication implements CommandLineRunner {
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
    }
}
