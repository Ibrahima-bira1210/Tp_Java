package Dossier;

import java.util.ArrayList;


public class Dossier <DossierType >extends ArrayList {

    public DossierType dossierMedical,dossierAdministratif,facture;

    public Dossier(DossierType dossierMedical, DossierType dossierAdministratif, DossierType facture) {
        this.dossierMedical = dossierMedical;
        this.dossierAdministratif = dossierAdministratif;
        this.facture = facture;

        this.add(this.dossierMedical);
        this.add(this.dossierAdministratif);
        this.add(this.facture);
    }


}
