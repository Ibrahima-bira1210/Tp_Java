package Personnel;

import Dossier.DossierMedical;

public class Medecin extends PersonnelMedical{

    public Medecin(String nom, String premom, int age) {
        super(nom, premom, age);
    }

    public String interrogation(DossierMedical dm){
        return dm.toString() + "/n"+ dm.toStringAnalyse();

    }
}
