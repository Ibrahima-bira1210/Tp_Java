package Dossier;
import Personnel.Medecin;
import java.util.ArrayList;
import java.util.HashMap;



public class DossierMedical extends DossierType {

    public String groupeSangin;
   /* public Medecin medcinTraitant;*/
    public HashMap<String, String> analyseMedical;
    public ArrayList<String> allergie;
    public boolean maladieCArdiaque;
    public boolean maladiePulmonaire;

    /*constructor */

    public DossierMedical( int numeroDossier,
                          Patient proprietaire, String groupeSangin,
                          /*Medecin medcinTraitant,*/ HashMap<String, String> analyseMedical,
                          ArrayList<String> allergie, boolean maladieCArdiaque, boolean maladiePulmonaire) {
        super(numeroDossier, proprietaire);
        this.groupeSangin = groupeSangin;
        /*this.medcinTraitant = medcinTraitant;*/
        this.analyseMedical = analyseMedical;
        this.allergie = allergie;
        this.maladieCArdiaque = maladieCArdiaque;
        this.maladiePulmonaire = maladiePulmonaire;
    }
    public DossierMedical(){}



    public String toString() {
        return "DossierMedical{" +
                "groupeSangin='" + groupeSangin + '\'' +
               /* ", medcinTraitant=" + medcinTraitant +*/
                ", allergie=" + allergie +
                ", maladieCArdiaque=" + maladieCArdiaque +
                ", maladiePulmonaire=" + maladiePulmonaire +
                "'info proprietaire ="+super.toString()+
                '}';
    }

    public String toStringAnalyse(){
        return "Analye {" + analyseMedical.toString() + "}";
    }



    /* Getters*/

    public String getGroupeSangin() {
        return groupeSangin;
    }

    public void setGroupeSangin(String groupeSangin) {
        this.groupeSangin = groupeSangin;
    }

   /* public Medecin getMedcinTraitant() {
        return medcinTraitant;
    }

    public void setMedcinTraitant(Medecin medcinTraitant) {
        this.medcinTraitant = medcinTraitant;
    }*/

    public HashMap<String, String> getAnalyseMedical() {
        return analyseMedical;
    }

    /*setters*/

    public void setAnalyseMedical(HashMap<String, String> analyseMedical) {
        this.analyseMedical = analyseMedical;
    }

    public ArrayList<String> getAllergie() {
        return allergie;
    }

    public void setAllergie(ArrayList<String> allergie) {
        this.allergie = allergie;
    }

    public boolean isMaladieCArdiaque() {
        return maladieCArdiaque;
    }

    public void setMaladieCArdiaque(boolean maladieCArdiaque) {
        this.maladieCArdiaque = maladieCArdiaque;
    }

    public boolean isMaladiePulmonaire() {
        return maladiePulmonaire;
    }

    public void setMaladiePulmonaire(boolean maladiePulmonaire) {
        this.maladiePulmonaire = maladiePulmonaire;
    }


}
