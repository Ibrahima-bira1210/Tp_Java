

import Dossier.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String arg[]){

        HashMap <String,String> analyseMedical = new HashMap<>();
        ArrayList<String> allergie = new ArrayList<>();
        Patient p1 = new Patient();

        p1.numTelephone = 774108347;
        p1.lieuDeNaissance = "Dakar";
        p1.agePatient=21;
        p1.nomPatient="Faye";
        p1.prenomPatient="Ibrahima";
        p1.dateDeNAissance ="12/10/98";
        p1.adressePatient= "cite Assane Diop";
        p1.isMutueled=Boolean.FALSE;


        DossierMedical dm1 = new DossierMedical(1,p1,
                "O+", analyseMedical,allergie,Boolean.FALSE,Boolean.FALSE);

        DossierAdministratif da1 = new DossierAdministratif(124,p1,
                "dentiste");

        Facture f1 = new Facture(1,p1,140000);

        Dossier<DossierType> d1 = new Dossier(dm1,da1,f1);

        System.out.println("Affichage du Patient");
        System.out.println(p1.toString());
        /*
        System.out.println("Dossier Medical pour infirmier");
        System.out.println(dm1.toStringInfirmier());
        System.out.println("Dossier Medical pour medecin");
        System.out.println(dm1.toStringMedcin());
        System.out.println("Dossier Administratif");
        System.out.println(da1);
        System.out.println("Facture");
        System.out.println(f1);
        System.out.println(d1);*/
    }
}
