package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

       // Square square = new Square(-10);

       // System.out.println("Wooden Spoon"); // exit code will be 0. If exit code is 0, something went wrong.

        Square square = new Square(10);

        System.out.println(square);

        // square.side = 20; this side is not accessible because it assigned private.

        square.setSide(15);

        System.out.println(square);


        Rectangle rectangle = new Rectangle(5, 6);

        System.out.println(rectangle);

        Circle circle = new Circle(5);

        System.out.println(circle);

        circle.setRadius(10);

        System.out.println(circle.getRadius());

        System.out.println(circle);

        System.out.println(circle.getName());
    }
}
