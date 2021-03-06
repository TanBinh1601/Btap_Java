package resizeable;

public class circle extends shape implements Resizeable {
    private double radius;

    public circle(){
        this.radius = 1;
    }
    public circle(double radius){
        this.radius = radius;
    }

    public circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.pow(radius, 2)*Math.PI;
    }

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +
                '}'+ super.toString();
    }

    @Override
    public void resize(double percent) {
        this.radius *= 1+(percent/100);
    }
}
