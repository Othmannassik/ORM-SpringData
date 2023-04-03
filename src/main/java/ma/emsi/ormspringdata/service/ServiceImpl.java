package ma.emsi.ormspringdata.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.emsi.ormspringdata.entities.Consultation;
import ma.emsi.ormspringdata.entities.Medecin;
import ma.emsi.ormspringdata.entities.Patient;
import ma.emsi.ormspringdata.entities.RendezVous;
import ma.emsi.ormspringdata.repositories.ConsultationRepository;
import ma.emsi.ormspringdata.repositories.MedecinRepository;
import ma.emsi.ormspringdata.repositories.PatientRepository;
import ma.emsi.ormspringdata.repositories.RendezVousRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class ServiceImpl implements IService{
    PatientRepository patientRepository;
    MedecinRepository medecinRepository;
    RendezVousRepository rendezVousRepository;
    ConsultationRepository consultationRepository;
    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRendezVous(RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }

    @Override
    public Patient ChercherPatientParNom(String nom) {
        return patientRepository.findByNom(nom);
    }

    @Override
    public Medecin ChercherMedecinParNom(String nom) {
        return medecinRepository.findByNom(nom);
    }
}
