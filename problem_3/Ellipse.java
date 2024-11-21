package problem_3;

public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(double majorAxis, double minorAxis) {
        super("Ellipse");
        this.majorAxis = Math.max(majorAxis, minorAxis);
        this.minorAxis = Math.min(majorAxis, minorAxis);
    }

    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
     }

     public double getPerimeter() {
        double diff = majorAxis - minorAxis;
        if(diff == 0.0){
            return Math.PI * 2 * majorAxis;
        } else {
            return Math.PI * Math.sqrt((2*(Math.pow(majorAxis, 2) + Math.pow(minorAxis, 2))) - Math.pow(diff, 2)/2);
        }
    }

    public String toString() {
        return super.toString() + ", Major Axis: " + String.format("%.2f", majorAxis) + ", Minor Axis: " + String.format("%.2f", minorAxis);
    }
}
