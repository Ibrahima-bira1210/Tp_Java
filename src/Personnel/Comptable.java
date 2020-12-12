package Personnel;

import Dossier.Facture;
import Dossier.Patient;

import java.util.Random;
import java.util.Scanner;

public class Comptable extends PersonnelAdministratif{

    public Comptable(String nom, String premom, int age) {
        super(nom, premom, age);
    }

    public void Editer_Facture(Patient p, Facture f){


        Scanner scanner = new  Scanner(System.in);
        System.out.print("Veuillez entrer le montant de la facture :");
        f.montant =  scanner.nextInt();
        f.proprietaire = p;
        f.numeroDossier =  new Random().nextInt(1000);


    }

    public void Expedier_Facture(){

    }
}
