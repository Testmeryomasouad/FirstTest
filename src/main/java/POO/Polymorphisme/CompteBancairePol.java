package POO.Polymorphisme;

public class CompteBancairePol {
    protected String titulaire;
    protected double solde;

    public CompteBancairePol(String titulaire, double solde) {
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
//Overloading
    public void afficherInfos() {

        System.out.println("Titulaire: " + titulaire);
        System.out.println("Solde: " + solde);
       // System.out.println("Polymorphisme Overloading");
    }

       public void afficherInfos(String message) {
        System.out.println("Polymorphisme Overloading");
        System.out.println(message);
        afficherInfos();
    }
}
