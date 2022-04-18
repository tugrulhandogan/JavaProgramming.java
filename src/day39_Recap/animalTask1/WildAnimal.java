package day39_Recap.animalTask1;

public class WildAnimal extends Animal{

    public WildAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

        private Boolean isWild;
        private Boolean isFriendly;
        private Boolean isPlayable;



    public void hunt (){
            System.out.println(getName() + " is hunter");
        }



}
/*
3. Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()
 */