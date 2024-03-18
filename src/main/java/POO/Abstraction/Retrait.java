package POO.Abstraction;

import POO.Heritage.CompteEpargne;

public class Retrait extends Transaction{


    private double amountRetrait;
    public Retrait(double amount, String name,double amountRetrait) {
        super(amount, name);
        this.amountRetrait=amountRetrait;
    }

    @Override
    public void effectuer() {
        setAmount(getAmount()-this.amountRetrait);
        System.out.println("Retrait de:" +getName()+" dans son compte et de "+getAmount());
    }
}
