package day37_Inheritance1.scrumTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, "Developer", id, salary, companyName);
    }

    public void fixBugs(){
        System.out.println(jobTitle+" "+name+" is crying");
    }

}
/*
4. Create a sub class of EMployee named Developer:

			Add any extra variable or method that Developer object need to have

 */