package POO.Heritage;

public class CompteBancaire {
    protected String titulaire;
    protected double solde;

    public CompteBancaire(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public void deposer(double montant) {
        solde += montant;
    }

    public void retirer(double montant) {
        solde -= montant;
    }

    public double getSolde() {
        return solde;
    }
}
