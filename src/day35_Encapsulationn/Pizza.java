package day35_Encapsulationn;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;
    private int maxNumberCheese;
    private int maxNumberPepperoni;
    private int basicCost;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }


    public String getSize() {
        return size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")) {
            this.size = size;
        } else return;

        if (size.equalsIgnoreCase("small")) {
            maxNumberCheese = 3;
            maxNumberPepperoni = 4;
            basicCost = 10;
        } else if ((size.equalsIgnoreCase("medium"))) {
            maxNumberCheese = 4;
            maxNumberPepperoni = 5;
            basicCost = 12;

        } else {
            maxNumberCheese = 5;
            maxNumberPepperoni = 6;
            basicCost = 14;
        }
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (size != null && numberOfCheeseTopping >= 0) {
            if (numberOfCheeseTopping > maxNumberCheese) {
                System.out.println("Max number of cheese topic of  " + size + " is: " + maxNumberCheese);
                this.numberOfCheeseTopping = maxNumberCheese;
            }
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (size != null && numberOfPepperoniTopping >= 0) {
            if (numberOfPepperoniTopping > maxNumberPepperoni) {
                System.out.println("Max number of pepperoni topic of  " + size + " is: " + maxNumberPepperoni);
                this.numberOfPepperoniTopping = maxNumberPepperoni;
            }
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }


    public int calcCost() {
        return basicCost + 2 * (numberOfPepperoniTopping + numberOfPepperoniTopping);
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", Total Cost=" + calcCost() +
                '}';
    }
}


/*
5. Pizza Task:
		5.1 Create class named Pizza:
				private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping

				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case insensitive

							Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5

							Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

										small: 4
										medium: 5
										large: 6

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)


				Methods:
					calcCost(): returns the totalCost of the pizza
					toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */
