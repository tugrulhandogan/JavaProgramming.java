package day39_Recap.cydeoTask;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        super.work();
    }
}
/*
 5. Create a sub class of Employee named Teacher

            Override the work method

 */