package JavaBasics;

public abstract class Basics {
    //Data TYPE


        //Primitive data type

             //Non-Numeric type

              private  static final boolean absent=false;
               char gendre='F';

             //Numeric type

               //Integer

                    Integer temp=50;
                    int age=20;
                    byte bit=127;
                    short distance=5000;
                    long salary=872872829;


               //Floating
                    float amount=9.99999f;
                    double number =767.97;



         //Non-Primitive data type
            String name="Meriem";



            //Utilisation des variables


    public Basics() {

    }

    public strictfp void afficher(){
        String etat=absent?"Presente":"Absente";
        System.out.println(name+" a "+age+" de gendre "+gendre+" habite "+distance+" loin de London "+etat+" de ce forum"+"\n"+"Salary "+salary+" Amount "+amount+" Numbre "+ number+" Temperature en Marrakech est "+temp.toString()+"C");


    }
    public abstract  void  heelo();

}
