package day39_Recap.animalTask1;

public class Dog extends FriendlyAnimal {


    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    public void bark() {
        System.out.println(getName() + " is barking");
    }


    @Override
    public void eat() {
        super.eat();
    }
}
/*
Create the following sub classes of FriendlyAnimal and Override the eat method
			1. Dog:
					Extra methods:
						bark()
 */
