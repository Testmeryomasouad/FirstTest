package POO.Abstraction;

public class Depot extends Transaction{

    private double amountDepot;

    public Depot(double amount, String name,double amountDepot) {
        super(amount, name);
        this.amountDepot=amountDepot;
    }


    public double getAmountDepot() {
        return amountDepot;
    }

    public void setAmountDepot(double amountDepot) {
        this.amountDepot = amountDepot;
    }

    @Override
    public void effectuer() {
        setAmount(getAmount()+this.amountDepot);
        System.out.println("Depot de:" +getName()+" dans son compte et de "+getAmount());
    }
}
