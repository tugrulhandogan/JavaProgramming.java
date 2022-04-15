package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

      //  System.out.println(AccessModifiers_Test4.name1);
        System.out.println(AccessModifiers_Test4.name2);

        AccessModifiers_Test4.method2();
     // AccessModifiers_Test4.method1(); // tell me the different between default and protected access modifiers. It is an interview question.


    }

}
