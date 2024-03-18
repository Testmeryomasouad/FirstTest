package POO.Heritage;

public class CompteEpargne extends CompteBancaire{

    private double tauxInteret;

    public CompteEpargne(String titulaire, double solde, double tauxInteret) {
        super(titulaire, solde);
        this.tauxInteret = tauxInteret;
    }

    public void appliquerInteret() {
        solde *= (1 + tauxInteret);
    }
}
