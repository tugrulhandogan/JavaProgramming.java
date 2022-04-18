package day39_Recap.animalTask1;

public class FriendlyAnimal extends Animal{

    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    private Boolean isWild;
    private Boolean isFriendly;
    private Boolean isPlayable;



    public void play(){
        System.out.println(getName() + " is playing");
    }

    public void pet(){
        System.out.println(getName() + " is more pet");
    }


}
/*
2. Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */
