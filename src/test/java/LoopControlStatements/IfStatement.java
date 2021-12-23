package LoopControlStatements;

public class IfStatement {
    public static void main(String[] args) {
        int time = 22;
        if(time<10){
            System.out.println("Good Morning");
        }
        else if (time<20){
            System.out.println("Good Day");
        }
        else {
            System.out.println("Good evening");
        }

        System.out.println("-----------------------------------");
                // if
                int x = 24;
                int y = 20;
                // if simplu, fara if else, fara else
                if (x>y) {
                    // daca conditia e adevarata, se executa codul dintre acolade
                    // daca nu e adevarata, se ignora blocul de cod intre {}
                    System.out.println("X mai mare!!!!");
                }


                //if else
                if (time < 18) {
                    // daca conditia e adevarata, se ajunge aici
                    // dar nu se mai intra si pe else
                    System.out.println("intra pe if");
                } else {
                    // daca conditia e falsa, se ajunge aici
                    // dar nu se ruleaza codul din if
                    System.out.println("intra pe else");
                }

                // else if
                int t = 20;
                // u singur if la inceput
                if (t < 10) {
                    System.out.println("Good morning.");
                    // putem pune oricate else if-uri dorim
                } else if (t < 20) {
                    System.out.println("Good day.");
                    // un singue else la final
                } else {
                    System.out.println("Good evening.");
                }
                // am terminat cu if-ul, continuam executia codului
                System.out.println("java isi continua executia");

                // one line if (if prescurcat)
                String n = (3>1) ?  "M" : "F";
                System.out.println(n);

                if (n == "F") {
                    System.out.println("It's a girl!");
                }
                if (n == "M") {
                    System.out.println("It's a boy!");
                }
            }
        }

