package day37_Inheritance1.scrumTask;

public class BusinessAnalyst extends Employee {


    public BusinessAnalyst(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "BusinessAnalyst", id, salary, companyName);
    }

    public void analyze() {
        System.out.println(name + " is analyzing the documents");
    }

}

/*
5. Create a sub class of EMployee named BusinessAnalyst:

			Add any extra variable or method that BusinessAnalyst object need to have
 */
