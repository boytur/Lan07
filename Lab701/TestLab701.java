package Lab701;

import java.util.Scanner;

public class TestLab701 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int animalInputNumber = kb.nextInt();
        //Create Obj.
        Poulty [] d1  = new Duck [animalInputNumber];
        Poulty [] c1 = new Chicken[animalInputNumber];
        Fish [] s1 = new Shark[animalInputNumber];
        Fish [] dol = new Dolphin [animalInputNumber];
        Fish [] r1 = new Ray [animalInputNumber]; 

        String arrCheck [] = new String [animalInputNumber];

        for (int i = 0 ; i < animalInputNumber ; i++){

            String animalOneInput = kb.next();
            String animalSecondInput = kb.next();

            if (animalOneInput.equals("Duck")){
                d1[i] = new Duck (animalSecondInput);
                arrCheck[i] = "d";
                Poulty.checkPo++;
            }
            else if (animalOneInput.equals("Chicken")){
                c1 [i] = new Chicken(animalSecondInput);
                arrCheck[i] = "c";
                Poulty.checkPo++;
            }

            else if (animalOneInput.equals("Shark")){
                s1 [i] = new Shark(animalSecondInput);
                arrCheck[i] = "s";
                Fish.checkFish++;
            }
            else if (animalOneInput.equals("Dolphin")){
                dol[i] = new Dolphin(animalSecondInput);
                arrCheck[i] = "dol";
                Fish.checkFish++;
            }
            else  if (animalOneInput.equals("Ray")){
                r1 [i]= new Ray(animalSecondInput);
                arrCheck[i] = "r";
                Fish.checkFish++;
            }
        }
        for (int i = 0 ; i < animalInputNumber ;i ++ ){
            if (arrCheck[i].equals("c")){
                System.out.println(c1[i].toString());
            }
            else if (arrCheck[i].equals("d")){
                System.out.println(d1[i].toString());
            }
            else if (arrCheck[i].equals("s")){
                System.out.println(s1[i].toString());
            }
            else if (arrCheck[i].equals("dol")){
                System.out.println(dol[i].toString());
            }
            else  if (arrCheck[i].equals("r")){
                System.out.println(r1[i].toString());
            }
        }
        
        System.out.println("The number of Poultry = " + Poulty.checkPo);
        System.out.println("The number of Fish = " + Fish.checkFish);
    }
}
