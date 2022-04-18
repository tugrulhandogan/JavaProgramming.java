package day39_Recap.animalTask1;

public class Parrot extends FriendlyAnimal {


    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void fly() {
        System.out.println(getName() + " is flying");
    }

    public void sing() {
        System.out.println(getName() + " is singing");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
/*
4. Parrot:
					Extra methods:
						fly()
						sing()
 */