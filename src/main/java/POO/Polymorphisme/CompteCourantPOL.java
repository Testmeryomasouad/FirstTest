package POO.Polymorphisme;

import POO.Heritage.CompteBancaire;

public class CompteCourantPOL extends CompteBancairePol {


    public CompteCourantPOL(String titulaire, double solde) {
        super(titulaire, solde);
    }

    @Override
    public void afficherInfos() {

        System.out.println("Polymorphisme Overrinding");
        super.afficherInfos();
    }

    @Override
    public void afficherInfos(String message) {
        super.afficherInfos(message);
    }
}
