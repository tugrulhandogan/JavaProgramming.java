package day38_Inheritance2.carTask1;

public class BMW extends Car {
    public BMW(String brand, String model, String color, int year, double price, double miles) {
        super(brand, model, color, year, price, miles);
    }

    @Override
    public void start(){
        System.out.println("Call mechanic to jump start "+brand+" "+model);
    }
}
/*
2. BMW:
					extra methods:
						breaksDown()
						racing()
 */