package Dossier;

public class Facture extends DossierType{
    public int montant;


    public Facture( int numeroDossier,Patient proprietaire, int montant) {
        super( numeroDossier, proprietaire);
        this.montant = montant;
    }
    public Facture(){
        super();
    };

    public void setMontant(int montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Facture{" +
                "montant=" + montant +
                "'info proprietaire = '"+super.toString()+
                '}';
    }

    public int getMontant() {
        return montant;
    }
}
