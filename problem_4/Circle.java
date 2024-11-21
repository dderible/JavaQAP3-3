package problem_4;

public class Circle extends Ellipse {
    private double radius;

    public Circle(double radius, String name){
        super(radius, radius);
        this.radius = radius;
        this.name = name;
    }

    public String toString() {
        return super.toString() + name + ", Radius: " + String.format("%.2f", this.radius);
    }

    public void scale(double factor) {
        radius *= factor;
    }
}
