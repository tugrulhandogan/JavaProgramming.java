package day33_Statics;

public class Dog {

    public String breed, size, color;
    public char gender;
    public int age;

    public static int numberOfLegs, numberOfEyes, numberOfWings;
    public static boolean isFriendly;

    public Dog(String breed, String size, String color, char gender, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    public void eat() {
        System.out.println(breed + "is eating food");
    }

    public void sleep() {
        System.out.println(breed + "is sleeping");
    }

    public void play() {
        System.out.println(breed + "is playing");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
/*
6. Dog Task:
		1. Create a class called Dog
	            Attributes:
	            	instance: breed, size, gender, age, color
	            	statics: numberOfLegs, numberOfEyes, numberOfWings, isFriendly

	            Add a constructor to initialized all the fields (instances)

	            Methods:
	            	eat()
	            	sleep()
	            	play()
	                toString()

 */
