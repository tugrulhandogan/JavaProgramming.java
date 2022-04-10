package day38_Inheritance2.carTask;

public class Toyota extends Car{


    public Toyota(String brand, String model, String color, int year, double price, double miles) {
        super(brand, model, color, year, price, miles);
    }

    public void reliable(){
        System.out.println(brand+" "+model+" is reliable");
    }
}
/*
	1. Toyota:
					extra methods:
							reliabile()
 */