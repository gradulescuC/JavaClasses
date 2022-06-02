public class Data_Types_03 {

    public static void main(String[] args) {

        /*
        A data type is the property of a variable that defines what kind of information can we store in that specific variable

        There are two types of data types, as specified below - primitive (which are built directly in java)
                        and non-primitive (which are defined as classes of objects - see POO concepts)
         */

        // Primitive data types
        byte bt;	// 1 byte	Stores whole numbers from -128 to 127
        short st; //	2 bytes	Stores whole numbers from -32,768 to 32,767
        int	 in; // 4  bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long lg; // 8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float ft; // 	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double	db; // 8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
        boolean	bl; // 1 bit	Stores true or false values
        char chr; // 	2 bytes	Stores a single character/letter or ASCII values

        // Non primitive data types
        String hello = "";
        System.out.println(hello);
        String firstName = "Gabriela";
        String lastName = "Mateescu";
        System.out.println("-----------String concatenation-------------");
        System.out.println(firstName + " " + lastName);

        System.out.println("-----------String methods-------------");
        System.out.println("firstName.length(): " + firstName.length());
        System.out.println("firstName.toUpperCase(): " + firstName.toUpperCase());
        System.out.println("firstName.isEmpty()" + firstName.isEmpty());

        System.out.println("-------------Type casting-------------");
        final double PI = 3.14;
        System.out.println("------------Manual casting--------------");
        int int_pi = (int) PI;
        System.out.println("Initial value of PI: " + PI);
        System.out.println("Resulting value after casting: " + int_pi);

        System.out.println("------------Automatic casting--------------");

        int age = 13;
        float new_age;
        new_age = age; // it will convert the value stored in the variable age from int to float
        System.out.println("Initial value of age: " + age);
        System.out.println("Resulting value after manual casting: " + new_age);
        float weight = 55.65f;
//        int new_weigt = weight; // this will return error, because you are trying to cast a wider type to a smaller type
        int new_weigt = (int) weight; // this will work, but with the cost of data loss
        System.out.println("Initial value of weight: " + weight);
        System.out.println("Resulting value after manual casting: " + new_weigt);
    }
}