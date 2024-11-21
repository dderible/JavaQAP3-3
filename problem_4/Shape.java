package problem_4;

public abstract class Shape implements Scalable {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getPerimeter();
    public abstract double getArea();

    public String toString() {
        return "Shape: " + name + ", Perimeter: " + String.format("%.2f", getPerimeter()) + ", Area: " + String.format("%.2f", getArea());
    }
}
