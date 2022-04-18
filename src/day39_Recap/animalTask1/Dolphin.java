package day39_Recap.animalTask1;

public class Dolphin extends FriendlyAnimal {


    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void swim() {
        System.out.println(getName() + " is swimming");
    }


    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }
}
/*
3. Dolphin:
					Extra methods:
						swim()

 */