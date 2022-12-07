package Ex12;

import java.util.ArrayList;

public class Ex12 {
    public static void main(String [] args)
    {

        ArrayList<Integer> vetor = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();

        for(int i=0; i < 20; i++){
            vetor.add(i);
            if (i % 2 == 0) {
                pares.add(i);           
            } 
        }


        for(Integer n : pares)
        {
            System.out.println(n);
        }
    }
}
