public class Variabile {
// indentare, adica un tab in interiorul clasei

    public static void main(String[] args) {
        // declarare
        int age; // tipul, numele cu litera mica
        age = 7; // ii dau valoare
        // apelam variabila
        System.out.println(age);

        // suprascriere
        age = 10;
        // apelam variabila
        System.out.println(age);

        // declarare + initilizare
        int days = 7;

        // constante
        final int WEEKS = 4; // ea nu mai poate fi schimbata

        final int HOURS_IN_A_DAY =24;
        System.out.println(HOURS_IN_A_DAY);

        String greeting = "Test";
        System.out.println(greeting.length());
        System.out.println(greeting.contains("Te"));
        System.out.println(greeting.toUpperCase());
    }
}
