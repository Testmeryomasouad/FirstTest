package POO.Abstraction;

public abstract class Transaction {
    private double amount ;
    private String name;

    public Transaction(double amount, String name) {

        this.amount = amount;
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract  void effectuer();
}
