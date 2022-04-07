package day35_Encapsulationn;

public class Item1 {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item1(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty() || !name.isBlank()) {
            System.out.println("Name cannot be empty or blank");
        }
        for (int i = 0; i < name.length(); i++) {
            if (Character.isLetterOrDigit(name.charAt(i)) || !Character.isWhitespace(name.charAt(i))) {
               this.name = name;
            } else if (Character.isLetter(name.charAt(0))) {
                this.name = name;
            }
        }
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    String message = "";

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            System.out.println("Invalid entry unit price cannot be negative");

        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    String result = "";

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Invalid entry unit price cannot be negative");
        } else if ("toilet paper".equalsIgnoreCase(getName()) && quantity > 1) {
            System.out.println("Toilet paper's quantity cannot be more than 1");
        } else {
            this.quantity = quantity;
        }
    }

    public double calcCost() {
        return this.getQuantity() * this.getUnitPrice();
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", message='" + message + '\'' +
                ", result='" + result + '\'' +
                ", cost='" + calcCost() + '\'' +
                '}';
    }
}
/*
4. Item Task
		4.1create a class called Item
	            private variables:
	            	name, unitPrice, quantity

            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()

 */
