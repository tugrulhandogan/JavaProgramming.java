package day39_Recap.animalTask1;

public class Cat extends FriendlyAnimal{


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void scratch(){
        System.out.println(getName()+ " is scratching");
    }

    public void meow(){
        System.out.println(getName() + " is meowing");
    }

    @Override
    public void eat() {
        super.eat();
    }


}
/*
2. Cat:
					Extra methods:
						scratch()
						meow()
 */