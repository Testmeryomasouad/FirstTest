package POO.Polymorphisme2;

public class CompteEpargne extends CompteBancaire{
    double Interet;

    public CompteEpargne(double solde, double tauxInteret) {
        super(solde);
        this.Interet=tauxInteret;
    }
    public void retirer(double montant) {
        System.out.println("Les retraits ne sont pas autorisés sur un compte épargne.");
    }

    public void calculerInterets() {
        double interet = Solde * Interet;
        Solde += interet;
        System.out.println("Intérêts calculés. Nouveau solde: " + Solde);
    }
}
