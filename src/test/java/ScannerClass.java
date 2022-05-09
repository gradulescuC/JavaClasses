import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // am instantiat un obiect al clasei Scanner numit sc (care este de fapt o variabila)

        System.out.println("introdu nota elevului");

        int nota = sc.nextInt(); // metoda nextInt() este o metoda a clasei Scanner
                                        // ca sa accesam o metoda a oricarei clase (cu mici exceptii) trebuie sa avem instantiat
                                               //  un obiect al clasei respective

//        String numeStudent = sc.nextLine(); // instruieste sistemul sa ceara un sir de caractere de tip text de la tastatura
//        int varstaStudent = sc.nextInt(); // instruieste sistemul sa ceara un sir de caractere de tip numeric de la tastatura
//        long testLongNumber = sc.nextLong();
//        double doubleTestNumber = sc.nextDouble();

        if (nota <= 4 && nota >= 1) {
            System.out.println("Elevul este corigent");
        } else if (nota > 4 && nota <= 6 )
        {
            System.out.println("Elevul este slab");
        } else if (nota == 7 || nota == 8) {
            System.out.println("Elevul este mediu");
        } else if (nota == 9 || nota == 10 ){
            System.out.println("Elevul este eminent");
        } else {
            System.out.println("Introdu o nota intre 1 si 10");
        }
    }
}

