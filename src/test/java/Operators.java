public class Operators {
    public static void main(String[] args) {
        // Operatori aritmetici
        int x=7;
        int y=8;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y); // Atunci cand se face impartirea intre doua numere intregi rezultatul va fi un numar intreg trunchiat in cazul in care rezultatul va fi cu zecimale.
        System.out.println(y%x); // asta o operatiune modulo adica returneaza restul impartirii primului nr la al doilea nr.\
        x++; // Asta este un operator de incrementare
        y--; // Asta este un operator de decrementare
        System.out.println(x+" "+y);

        //operatori de asignare
        x=10; // Acesta este un operator cu care schimbam valoarea unei variabile.
        System.out.println(x);
        x=x+3;
        System.out.println(x);
        x+=3; // Instructiunea aceasta este identica cu cea de la linia 16
        System.out.println(x);
        x=x-3;
        System.out.println(x);
        x-=3;
        System.out.println(x);
        x=x*3;
        System.out.println(x);
        x*=3;
        System.out.println(x);
        x=x/3;
        System.out.println(x);
        x/=3;
        System.out.println(x);

        //Operatori de comparatie
        // verificam daca x > y
        System.out.println(y>=6);

        // equal
        System.out.println(x==y);

        // not equal
        System.out.println(x!=y);

        //Operatori logici
//         && - care inseamna SI
//         || - care inseamna SAU
//         ! - care insemna NOT
        int a = 6;
        System.out.println(!(a<5 || a<10));
        System.out.println(a<5 && a<10);
        System.out.println(a<5 || a<10);

        System.out.println("---------------------------------");
        //verificati daca n este intre -2 si 13
        int n = 5;
        if (n > -2 && n < 13){
            System.out.println(n);
        }
        //System.out.println(n > -2 && n < 13);
        //verificati daca n are mai mult de 3 cifre
        System.out.println(n>=100);
    }
}