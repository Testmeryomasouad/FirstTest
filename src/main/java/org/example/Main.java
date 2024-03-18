package org.example;

import JavaBasics.Basics;
import JavaBasics.Collection;
import JavaBasics.herit;
import POO.Abstraction.Depot;
import POO.Abstraction.Retrait;
import POO.Heritage.CompteCourant;
import POO.Heritage.CompteEpargne;
import POO.Polymorphisme.CompteCourantPOL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;
import java.util.function.Predicate;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("-----------------------------\u001B[1m\u001B[5m\u001B[36mVariables\u001B[0m----------------------");
       String[] names = new String[4];
       String[] values={"Welcome","to","My","Word","time"};


       int  h=values.length;
       Basics basics=new herit();
       basics.heelo();
       int i=0;
        for (String name : names) {
            names[i] = values[i];
            i++;


        }


        System.out.println("-----------------------------------------------------------------------\u001B[1m\u001B[5m\u001B[35mCollection\u001B[0m----------------------");
        System.out.println("-----------------------------\u001B[1m\u001B[5m\u001B[36mStack\u001B[0m----------------------");

        //Stack
        Collection collection=new Collection();
        collection.afficherStack();

        System.out.println("-----------------------------\u001B[1m\u001B[5m\u001B[36mList\u001B[0m----------------------");
        ArrayList<String> liste = new ArrayList<>();
        liste.add("élément 1");
        liste.add("élément 2");
        Stream<String> s=liste.stream().map((v)->
            {
                System.out.println(v);
                return v;
            });
        s.forEach(System.out::println);



        System.out.println("-------------------------------------------------------------------\u001B[1m\u001B[5m\u001B[35mObject Oriented Programming POO\u001B[0m----------------------");


        //POO
          //Heritage
        System.out.println("-----------------------------\u001B[1m\u001B[5m\u001B[36mHeritage\u001B[0m----------------------");

        CompteCourant compteCourant=new CompteCourant("Mohamed",76276.3,788);
        CompteEpargne compteEpargne =new CompteEpargne("Khalid",928,9);


        compteCourant.deposer(898);
        compteEpargne.appliquerInteret();

        System.out.println("Solde de Compte Courant: "+compteCourant.getSolde()+" DHs");
        System.out.println("Solde de Compte Epargne: "+compteEpargne.getSolde()+" DHs");



        //Abstraction
        System.out.println("-----------------------------\u001B[1m\u001B[5m\u001B[36mAbstraction\u001B[0m----------------------");


        Depot depot=new Depot(872827,"Mohamed",878);
        Retrait  retrait=new Retrait(872827,"Mohamed",99);
        Retrait  retraitt=new Retrait(89776,"souad",90);


         depot.effectuer();
         retrait.effectuer();
         retraitt.effectuer();



         //Polymorphisme
        System.out.println("-----------------------------\u001B[1m\u001B[5m\u001B[36mPolymorphisme\u001B[0m----------------------");

        CompteCourantPOL compteCourantPOL=new CompteCourantPOL("Mohamed",989);
        compteCourantPOL.afficherInfos("Compte Courant");




    }
}