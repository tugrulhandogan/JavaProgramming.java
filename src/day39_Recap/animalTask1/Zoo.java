package day39_Recap.animalTask1;

import static day39_Recap.animalTask1.Dolphin.*;

public class Zoo {

    public static void main(String[] args) {

        Bear bear = new Bear("Ayı", "Panda", 'M', 2, "Medium", "Black and White");
        System.out.println(bear);

        Dolphin dolphin = new Dolphin("Joe", "Fish",'F', 3, "Large", "Gray");
        System.out.println(dolphin);

        dolphin.eat();


    }
}
/*
6. Create a class named Zoo:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes

 */
