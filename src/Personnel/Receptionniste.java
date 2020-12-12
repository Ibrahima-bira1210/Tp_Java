package Personnel;

import Dossier.DossierAdministratif;
import Dossier.Patient;

import java.util.Random;
import java.util.Scanner;

public class Receptionniste extends PersonnelAdministratif {

    public Receptionniste(String nom, String premom, int age) {
        super(nom, premom, age);
    }

                         /* INSCRIPTION*/

    public void Inscription_administratif( Hopital h){
        if (h.getNombre_lit() > 0){
            Patient p = new Patient();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Veuillez entrer le prenom du patient :");
            p.prenomPatient = scanner.nextLine();
            System.out.print("Veuillez entrer le nom du patient :");
            p.nomPatient = scanner.nextLine();
            System.out.print("Veuillez entrer la date de naissance du patient :");
            p.dateDeNAissance =  scanner.nextLine();
            System.out.print("Veuillez entrer le lieu de naissance du patient :");
            p.lieuDeNaissance = scanner.nextLine();
            System.out.print("Veuillez entrer l'age du patient :");
            p.agePatient = scanner.nextInt();
            System.out.print("Le patient a t'il un mutuel ? :");
            p.isMutueled = scanner.nextBoolean();
            System.out.print("Veuillez entrer l'adresse du patient :");
            p.adressePatient = scanner.nextLine();
            System.out.print("Veuillez entrer le numero de telephone du patient :");
            p.numTelephone = scanner.nextInt();
            System.out.print("Veuillez entrer le departement ou le patient est admis :");
            String dept = scanner.nextLine();

            Random rand = new Random();

            DossierAdministratif d = new DossierAdministratif(rand.nextInt(1000),
                    p,dept);

        }

        else {
            System.out.println("Redirection vers un autre hopital");
        }

    }

}
