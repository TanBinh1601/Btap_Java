package resizeable;

public class rectangle extends shape implements Resizeable {
    private double width;
    private double height;

    public rectangle(){
        this.width = 1;
        this.height = 1;
    }
    public rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public rectangle(String color, boolean filled, double width, double height){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (this.height + this.width);
    }

    @Override
    public String toString() {
        return "rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}'+ super.toString();
    }

    @Override
    public void resize(double percent) {
        this.width *= 1 + (percent/100);
        this.height *= 1 + (percent/100);
    }
}
