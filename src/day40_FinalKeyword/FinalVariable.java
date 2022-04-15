package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name; // STATIC ALWAYS CAN BE CHANGED.

    static{
        name = "Batch 25";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        final double pi = 3.14;

        // pi = 4.14; final variables cannot be reassigned.
        // pi = 5.4;

        final String name;

        name = "Java";

        //name = "Wooden spoon";It can never be reassigned.

        System.out.println(name);

        System.out.println("*****************************************************");


        FinalVariable obj = new FinalVariable("May/01");

        // obj.birthDay = "June/01"; final variable cannot be reassigned.
        System.out.println(obj.birthDay);

        System.out.println("*****************************************************");

       //  FinalVariable.name = "Phyton"; because it is assigned as FINAL.







    }
}
