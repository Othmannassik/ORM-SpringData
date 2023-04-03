package ma.emsi.ormspringdata;

import ma.emsi.ormspringdata.entities.*;
import ma.emsi.ormspringdata.repositories.ConsultationRepository;
import ma.emsi.ormspringdata.repositories.MedecinRepository;
import ma.emsi.ormspringdata.repositories.PatientRepository;
import ma.emsi.ormspringdata.repositories.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class OrmSpringDataApplication {
    @Autowired
    private PatientRepository patient;
    public static void main(String[] args) {
        SpringApplication.run(OrmSpringDataApplication.class, args);
    }

    @Bean
    CommandLineRunner start(PatientRepository patientRepository,
                            MedecinRepository medecinRepository,
                            RendezVousRepository rendezVousRepository,
                            ConsultationRepository consultationRepository){
        return args -> {
            Stream.of("Amine","Hamid","Ahlam","Douaa")
                    .forEach(nom -> {
                        Patient p = new Patient();
                        p.setNom(nom);
                        p.setDateNaissance(new Date());
                        p.setMalade(Math.random()>0.5 ? true : false);
                        p.setScore(387);
                        patientRepository.save(p);
                    });

            Stream.of("Ahmed","Aya","Imane","Imad")
                    .forEach(nom -> {
                        Medecin m = new Medecin();
                        m.setNom(nom);
                        m.setEmail(nom + "@gmail.com");
                        m.setSpecialite(Math.random()>0.5 ? "Dentiste" : "Orthophoniste");
                        medecinRepository.save(m);
                    });

            Patient patient = patientRepository.findByNom("Douaa");
            Medecin medecin = medecinRepository.findByNom("Aya");

            RendezVous rendezVous = new RendezVous();
            rendezVous.setDate(new Date());
            rendezVous.setStatusRdv(StatusRdv.PENDING);
            rendezVous.setPatient(patient);
            rendezVous.setMedecin(medecin);
            rendezVousRepository.save(rendezVous);

            RendezVous rendezVous1 = rendezVousRepository.findById(1L).orElse(null);

            Consultation consultation = new Consultation();
            consultation.setDate(new Date());
            consultation.setRapport("This is a rapport");
            consultation.setRendezVous(rendezVous1);
            consultationRepository.save(consultation);
        };
    }
}
