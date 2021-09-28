package moveablePoint;

public class testMoveAblePoint {
    public static void main(String[] args) {
        point p = new point(5, 6);
        moveablePoint m = new moveablePoint(p.getX(), p.getY(), 3,4);
        m.move();
        System.out.println(p.toString());
        System.out.println(m.toString());
    }
}
