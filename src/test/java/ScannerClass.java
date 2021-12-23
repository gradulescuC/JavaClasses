import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introdu nota elevului");
        int nota = sc.nextInt();

        if (nota <= 4 && nota >= 1) {
            System.out.println("Elevul este corigent");
        } else if (nota > 4 && nota <= 6 ) {
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

