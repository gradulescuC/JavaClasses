package flow_control;

public class JumpStatements {
    public static void main(String[] args) {
        for(int i = 0;i<10;i++){
            if(i==4){
                break;
            }
        }
        System.out.println("----------------------------");

        for(int i = 0;i<10;i++){
            if(i==4){
                continue;
            }
        }


        System.out.println("----------------------------");


                // break iese din for
                for (int i = 1; i < 102; i++) {
                    System.out.println(i);
                    if (i == 7) {
                        break; // break opreste executia!
                    }
                }

                // continue
                for (int i = 1; i <= 101; i++) {

                    if (i == 13) {
                        System.out.println("Numarul pe care nu vrem sa-l pronuntam!");
                        continue; // il sare pe 13
                    }
                    System.out.println(i);
                }



                // break poate fi folosit si in while
                // opreste codul cand conditia e adevarata
                int i = 1;
                while (i < 10) {
                    System.out.println(i);
                    if (i == 7) {
                        break;
                    }
                    i++;

                }

                // continue
                int n = 1;
                while (n < 10) {
                    if (n == 7) {
                        n++; //  nu uitam sa incrementam inainte de continue
                        continue; // cand conditia e adevarata, se sare peste acest pas
                    }
                    System.out.println(n);
                    n++;
                }
            }
        }