package day37_Inheritance1.phoneTask;

public class Iphone extends Phone {


    public Iphone(String brand, String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
        // you can declare "Apple" to brand because all Iphone's brand is Apple
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + " " + " is having a Face Time with phone number: " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand + " " + model + " is having a Face Time with email: " + email);
    }
}
/*
 1.2 Create a subclass of Phone named IPhone:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    faceTime(long phoneNumber)
                    faceTime(String email)
                    toString()
 */