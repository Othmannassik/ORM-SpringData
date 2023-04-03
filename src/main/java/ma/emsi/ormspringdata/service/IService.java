package ma.emsi.ormspringdata.service;

import ma.emsi.ormspringdata.entities.Consultation;
import ma.emsi.ormspringdata.entities.Medecin;
import ma.emsi.ormspringdata.entities.Patient;
import ma.emsi.ormspringdata.entities.RendezVous;

public interface IService {
    Patient savePatient (Patient patient);
    Medecin saveMedecin (Medecin medecin);
    RendezVous saveRendezVous (RendezVous rendezVous);
    Consultation saveConsultation (Consultation consultation);

    Patient ChercherPatientParNom(String nom);
    Medecin ChercherMedecinParNom(String nom);

    RendezVous ChercherRendezVousParId(Long id);
}
