package day33_Statics;

public class IphoneTask {

    public String model;
    public int price;
    public String color;
    public String size;

    public static String brand;
    public static String os;
    public static String madeIn;

    public void faceTime(long phoneNumber) {
        System.out.println("Phone number: " + phoneNumber);
    }

    public void faceTime(String email) {
        System.out.println("E mail: " + email);
    }

    public void call(long phoneNumber) {
        System.out.println("Calling to: " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println("Texting to: " + phoneNumber);
    }

    @Override
    public String toString() {
        return "IphoneTask{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
/*
4. IPhone Task:
		1. Creta a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */
