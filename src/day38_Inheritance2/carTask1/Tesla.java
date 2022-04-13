package day38_Inheritance2.carTask1;

public class Tesla extends Car {

    public Tesla(String brand, String model, String color, int year, double price, double miles) {
        super(brand, model, color, year, price, miles);
    }

    public void autoPilot(){
        System.out.println(brand+" "+model+" in autopilot mode");
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start "+brand+" "+model);
    }
}
/*
3. Tesla:
					extra methods:
						autoPilot();

						01.04
 */