package day39_Recap.animalTask1;

public class Animal {

    private String name;
    private String breed;
    private char gender;
    private int age;
    private String size;
    private String color;

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        if (name.equals(null)){
            System.err.println("Please enter a valid name");
            System.exit(1);
        }else if (name.isEmpty()){
            System.err.println("Name cannot be empty");
            System.exit(1);
        }else if(name.isBlank()){
            System.err.println("Name cannot has blank");
            System.exit(1);
        }
        this.name = name;
    }

    public void setBreed(String breed) {
        if (breed.equals(null)){
            System.err.println("Please enter a valid breed" );
            System.exit(1);
        }else if (breed.isEmpty()){
            System.err.println("Breed cannot be empty");
            System.exit(1);
        }else if(breed.isBlank()){
            System.err.println("Breed cannot has blank");
            System.exit(1);
        }
        this.breed = breed;
    }

    public void setGender(char gender) {
        if(!(gender == 'F' || gender == 'M')){
            System.err.println("Please enter a valid gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public void setAge(int age) {
        if (age < 0){
            System.err.println("Please enter a valid age!");
            System.exit(1);
        }
        this.age = age;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        if (color.equals(null)){
            System.err.println("Please enter a valid color" );
            System.exit(1);
        }else if (color.isEmpty()){
            System.err.println("Color cannot be empty");
            System.exit(1);
        }else if(color.isBlank()){
            System.err.println("Color cannot has blank");
            System.exit(1);
        }
        this.color = color;
    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setSize(size);
        setColor(color);
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name + " is drinking");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void move(){
        System.out.println(name + " is moving");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}
/*
1. Create a class named Animal:
			variables:
				name, breed, gender, age, size, color

			Encapsulate all the fields

			Add a constructor to set all the fields

					Conditions:
						1. name, breed and color can not be null (if obj == null means it's error)
						2. name, breed and color can not be empty or can not be blank
						3. gender should only be set to either 'M' or 'F'
						4. age can not be set to negative

			Methods:
				eat()
				drink()
				sleep()
				move()
				toString()

 */