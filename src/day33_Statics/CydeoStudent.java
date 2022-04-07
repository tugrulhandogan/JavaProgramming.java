package day33_Statics;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public int id;
    public int batchNumber;
    public int groupNumber;

    public static String schoolName = "Cydeo";
    public static String programmingLanguage = "Java";

    public CydeoStudent(String name, int age, char gender, int id, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study() {
        System.out.println("Name: " + name + " is studying " + programmingLanguage);
    }

    public void attendClass() {
        System.out.println(name + " is attended class");
    }

    public static void printSchoolName() {
        System.out.println(schoolName);
    }

    public static void printProgrammingLanguage() {
        System.out.println(programmingLanguage);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}

/*
CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()
 */