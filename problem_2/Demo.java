package problem_2;

public class Demo {
    public static void main(String[] args) {
        Point p1 = new Point(5, 7);
        System.out.println(p1);

        MoveablePoint p2 = new MoveablePoint(10, 15, 1.5f, 1.8f);
        System.out.println(p2);

        p2.move();
        System.out.println(p2);
    }
}
