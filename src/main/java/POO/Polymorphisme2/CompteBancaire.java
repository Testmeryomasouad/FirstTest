package POO.Polymorphisme2;

public class CompteBancaire implements Transaction{
    protected  double Solde;

    public CompteBancaire(double solde) {
        Solde = solde;
    }

    @Override
    public void EffectuerTransaction(double m) {
        Solde+=m;
        System.out.println("Depot de "+m+"dhs effectue. Nouveau solde: " + Solde);
    }
    public void retirer(double m) {
        if (m <= Solde) {
            Solde -= m;
            System.out.println("Retrait de " + m + " effectué. Nouveau solde: " + Solde);
        } else {
            System.out.println("Fonds insuffisants .");
        }
    }
}
