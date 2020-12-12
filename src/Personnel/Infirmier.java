package Personnel;

import Dossier.DossierMedical;
import Dossier.Patient;

import java.util.Random;
import java.util.Scanner;

public class Infirmier extends PersonnelMedical {

    public Infirmier(String nom, String premom, int age) {
        super(nom, premom, age);
    }

    public void initialiserDossierMedical (Patient p){
        DossierMedical dm = new DossierMedical();
        dm.proprietaire = p;
        dm.numeroDossier = new Random().nextInt(1000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("renseigner le groupe sanguin du patient");
        dm.groupeSangin = scanner.nextLine();
        System.out.println("renseigner les allergies du patient ");
        int ajout;
        do {
            dm.allergie.add(scanner.nextLine());
            System.out.println("taper 0 pour quitter");
            ajout = scanner.nextInt();
        }while (ajout !=0);
        System.out.println("Le patient a t'il une maladie cardiaque ?");
        dm.maladieCArdiaque = scanner.nextBoolean();
        System.out.println("Le patient a t'il une maladie pulmonaire ?");
        dm.maladiePulmonaire=scanner.nextBoolean();

    }


}
