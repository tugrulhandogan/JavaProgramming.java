package day41_Exceptions;

import day33_Statics.Student;

import java.util.Locale;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {


        //unchecked exception:

        int a = 10;
        int b = 0;

        //System.out.println(a / b); // While I am writing code if it does not give to me exception warning it is unchecked exception
        //System.out.println("Wooden Spoon");// without dealing this exception which is upper line I can continue to write code
        // this exceptions able to crush the program

       // char[] characters = {'A', 'B', 'C'};

      //  System.out.println(characters[99]); // ArrayIndexOutOfBoundsException!!! Unchecked exception.

        Student student = null;

      //  System.out.println(student.name); // null pointer exception

        String str = "Wooden Spoon";

        //str = null;

      //  System.out.println(str.toUpperCase());

        String str2 = ""; // object != null
        System.out.println(str2.isEmpty());



        // checked Exception:

        System.out.println("Hello");

        //   Thread.sleep(3000); // checked

        System.out.println("Cydeo");


        // FileInputStream file = new FileInputStream("path of the file");

        System.out.println("Java".charAt(1000)); // unchecked



    }

}
