package flow_control_06;

import java.util.Scanner;

public class if_statement_06_1  // if statement  = modalitate prin care putem pasa responsabilitatea de decizie asupra sistemului
        // trebuie sa alegi in a face actiunea x sau actiunea y in functie de rezultatul evaluarii unei conditii

{
    public static void main(String[] args) {
//      int time = 22;

        Scanner sc = new Scanner(System.in);
        System.out.println("Va rog sa introduceti ora curenta ");
        int time = sc.nextInt();

        if (time <= 10) {
            System.out.println("Good Morning");
        } else if (time < 20) {
            System.out.println("Good Day");
        } else {
            System.out.println("Good evening");
        }
    }
}
