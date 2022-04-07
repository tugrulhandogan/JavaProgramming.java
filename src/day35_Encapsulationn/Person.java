package day35_Encapsulationn;

public class Person {

    public String name, language;
    public char gender;
    public int age;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    // ExcellSheet =

    public Person(String name, String language, char gender, int age) {
        this.name = name;
        this.language = language;
        this.gender = gender;
        this.age = age;
    }

    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfHead = 1;
        numberOfWings = 0;
    }

    public static void printPlanetName() {
        System.out.println("Planet name is " + planet);
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", planet='" + planet + '\'' +
                '}';
    }
}
/*
1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize all the fields

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
 */
