package problem_4;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        else {
            System.out.println("ERROR: Invalid Triangle.");
            System.exit(1);
        }
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
     }

     public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public String toString() {
        return super.toString() + ", Side 1: " + String.format("%.2f", this.side1) + ", Side 2: " + String.format("%.2f", this.side2) + ", Side 3: " + String.format("%.2f", this.side3);
    }

    public void scale(double factor) {
        this.side1 *= factor;
        this.side2 *= factor;
        this.side3 *= factor;
    }
}
