package POO.Heritage;

public class CompteCourant extends CompteBancaire{

    private double decouvertAutorise;

    public CompteCourant(String titulaire, double solde, double decouvertAutorise) {
        super(titulaire, solde);
        this.decouvertAutorise = decouvertAutorise;
    }

    public void autoriserDecouvert(double montant) {
        if (montant <= decouvertAutorise + solde) {
            solde -= montant;
        } else {
            System.out.println("Opération impossible : découvert non autorisé.");
        }
    }
}
