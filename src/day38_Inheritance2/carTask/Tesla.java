package day38_Inheritance2.carTask;

public class Tesla extends Car{

    public Tesla(String brand, String model, String color, int year, double price, double miles) {
        super(brand, model, color, year, price, miles);
    }

    public void autoPilot(){
        System.out.println(brand+" "+model+" in autopilot mode");
    }
}
/*
3. Tesla:
					extra methods:
						autoPilot();
 */