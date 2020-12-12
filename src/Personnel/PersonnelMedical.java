package Personnel;

import Dossier.DossierMedical;
import Dossier.Patient;

public class PersonnelMedical extends Personnel{

    public PersonnelMedical(String nom, String premom, int age) {
        super(nom, premom, age);
    }

    public void consulter_donnees_medical(){

    }

    public void ajouter_nouvelle_donne(){

    }
    public String interrogation(DossierMedical dm){
        return dm.toString();
    }

}
