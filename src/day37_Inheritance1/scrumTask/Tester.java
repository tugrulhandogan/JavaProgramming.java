package day37_Inheritance1.scrumTask;

public class Tester extends Employee{ //Tester IS A Employee,  Tester IS A Person

    public Tester(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, "Tester", id, salary, companyName);
    }

    public void createTicket(){
        System.out.println(jobTitle + " " + name + "is creating ticket");
    }


}
/*
3. Create a sub class of Employee named Tester:

			Add any extra variable or method that Tester object need to have
 */