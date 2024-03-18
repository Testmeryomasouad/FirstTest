package POO;

public class POJO {
    private int num;
    private String prenom ;
    private String nom ;

    public POJO(int num, String prenom, String nom) {
        this.num = num;
        this.prenom = prenom;
        this.nom = nom;
    }

    public POJO() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
