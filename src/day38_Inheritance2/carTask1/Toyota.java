package day38_Inheritance2.carTask1;

public class Toyota extends Car {


    public Toyota(String brand, String model, String color, int year, double price, double miles) {
        super(brand, model, color, year, price, miles);
    }

    public void reliable(){
        System.out.println(brand+" "+model+" is reliable");
    }

    public void start(){
        System.out.println("Twist the key to ignition to start "+brand+" "+model);
    }



}
/*
	1. Toyota:
					extra methods:
							reliabile()
 */