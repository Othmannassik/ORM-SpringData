<h2>Mapping Objet Relationnel (ORM), JPA, Hibernate, Spring Data</h2>
<h3>Spring Data :</h3>

<p>• Spring Data est un module de Spring qui a déjà créé des interfaces génériques et des implémentations
génériques qui permettent de gérer les entités JPA. <br>
• En utilisant Spring Data, vous n’aurez plus besoin de faire appel à l’objet EntityManager pour gérer la
persitence. Spring Data le fait à votre place. <br>
• Spring Data nous évite de créer les interfaces et les implémentation JPA de la couche DAO. <br>
• Il suffit de créer une interface qui hérite de l’interface JPARepository pour hériter toutes les méthodes
classiques qui permettent de gérer les entités JPA. <br>
• En cas de besoin, vous avez la possibilité d’ajouter d’autres méthodes en les déclarant à l’intérieur de
l’interface JPARepository, sans avoir besoin de les implémenter. Spring Data le fera à votre place.</p>

<img src="Screenshots/Schema.png" alt="Schema">

<h3>L'ensemble des Entités JPA :</h3>
<h4>L'Entité Patient : </h4>
<img src="Screenshots/Patient.png" alt="Patient">

<h4>L'Entité Medecin : </h4>
<img src="Screenshots/Medecin.png" alt="Medecin">

<h4>L'Entité RendezVous : </h4>
<img src="Screenshots/RendezVous.png" alt="RendezVous">

<h4>L'Entité Consultation : </h4>
<img src="Screenshots/Consultation.png" alt="Consultation">

<h4>L'Entité User : </h4>
<img src="Screenshots/User.png" alt="User">

<h4>L'Entité Role : </h4>
<img src="Screenshots/Role.png" alt="Role">

<h3>L'ensemble des Repositories :</h3>
<h4>PatientRepository : </h4>
<img src="Screenshots/patientRepository.png" alt="MatientRepository">

<h4>MedecinRepository : </h4>
<img src="Screenshots/medecinRepository.png" alt="MedecinRepository">

<h4>RendezVousRepository : </h4>
<img src="Screenshots/rendezVousRepository.png" alt="RendezVousRepository">

<h4>ConsultationRepository : </h4>
<img src="Screenshots/consultationRepository.png" alt="ConsultationRepository">

<h4>UserRepository : </h4>
<img src="Screenshots/userRepository.png" alt="UserRepository">

<h4>RoleRepository : </h4>
<img src="Screenshots/roleRepository.png" alt="RoleRepository">

<h3>La Couche Service :</h3>
<h4>L'interface IService :</h4>
<img src="Screenshots/IService.png" alt="Iservice">

<h4>L'implémentation de L'interface IService :</h4>
<img src="Screenshots/ServiceImpl1.png" alt="ServiceImpl">
<img src="Screenshots/ServiceImpl2.png" alt="ServiceImpl">
<img src="Screenshots/ServiceImpl3.png" alt="ServiceImpl">
<img src="Screenshots/ServiceImpl4.png" alt="ServiceImpl">


<h4>Test de l'application :</h4>
<img src="Screenshots/Test1.png" alt="Test">
<img src="Screenshots/Test2.png" alt="Test">
