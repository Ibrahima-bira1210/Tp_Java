package Dossier;

public class DossierAdministratif extends DossierType{

    public String departementAdmis;

    public DossierAdministratif(int numeroDossier, Patient proprietaire, String departementAdmis) {
        super(numeroDossier, proprietaire);
        this.departementAdmis = departementAdmis;
    }

    @Override
    public String toString() {
        return "DossierAdministratif{" +
                ", departementAdmis='" + departementAdmis +
                ",info proprietaire='"+super.toString();

    }



    public String getDepartementAdmis() {
        return departementAdmis;
    }

    public void setDepartementAdmis(String departementAdmis) {
        this.departementAdmis = departementAdmis;
    }
}
