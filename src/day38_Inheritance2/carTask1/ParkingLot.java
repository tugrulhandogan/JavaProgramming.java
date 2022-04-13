package day38_Inheritance2.carTask1;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyota", "Camry", "Gray",2020 , 20000, 22325);

        Tesla tesla = new Tesla("Tesla", "Model S", "Red", 2022, 94990, 0);

        BMW bmw = new BMW("BMW", "X5", "black", 2020, 67844, 12000);

        toyota.start();
        tesla.start();
        bmw.start();

    }
}
