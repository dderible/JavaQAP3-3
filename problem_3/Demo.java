package problem_3;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(3,"Circle"),
            new Ellipse(5,6),
            new Triangle("Triangle", 3, 6, 8),
            new EquilateralTriangle("Equilateral Triangle",2),
    };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
