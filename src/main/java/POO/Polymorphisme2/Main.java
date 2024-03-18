package POO.Polymorphisme2;

public class Main {
    public static void main(String[] args) {
        // Polymorphisme par héritage
        Transaction compteEpargne = new CompteEpargne(1000, 0.02);
        Transaction compteCourant = new CompteBancaire(500);

        // Appel polymorphique
        compteEpargne.EffectuerTransaction(300);
        compteCourant.EffectuerTransaction(200);

        ((CompteEpargne) compteEpargne).calculerInterets(); // Appel spécifique à CompteEpargne
    }
}
