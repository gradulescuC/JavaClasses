public class DataTypes {

    public static void main(String[] args) {

        // numar intreg - IMP!

        // Primitive data types
        int speedLimit = 0;
        double pi = 3.14; // IMP!
        float pi2 = 3.14f;
        long y = 3L;
        boolean is_empty = false; // imp!
        char un_caracter = 'D';

        // Non primitive data types
        String hello = "";
        System.out.println(hello);
        String prenume = "Gabriela"; // imp!
        String nume = "Mateescu";
        // concatenare de stringuri
        System.out.println(prenume + " " + nume);
        // cateva metode ajutatoare ale unui string
        System.out.println(prenume.length());
        System.out.println(prenume.toUpperCase());
        prenume = prenume.toUpperCase();
        System.out.println(prenume);
        System.out.println(prenume.isEmpty());

        System.out.println("---------------------------------");

        // Type casting

        // manual casting
        int int_pi = (int) pi;
        System.out.println(int_pi);
        System.out.println(pi);

        // auto casting
        int age = 13;
        float new_age;
        new_age = age;
        System.out.println(new_age);
    }
}