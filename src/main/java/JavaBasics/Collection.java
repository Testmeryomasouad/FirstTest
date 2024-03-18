package JavaBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Collection {

    List<Integer> integersList=new ArrayList<>();
    ArrayList<String> stringArrayList=new ArrayList<>();

    Stack<String> strStack = new Stack<String>();

    //Collection

    public Collection() {
    }







    //Vector



    //--Stack

    public void afficherStack(){
        strStack.push("Stack");
        strStack.push("a");
        strStack.push("is");
        strStack.push("This");
        int n= strStack.size();

        for(int j = 1; j <=n; j++)
        {
            String temp = strStack.peek();
            System.out.print(temp + " ");
            strStack.pop();

        }
        System.out.println();

    }
}

