package resizeable;

public class square extends rectangle implements Resizeable {
    public square(){
        super(1,1);
    }
    public square(double size){
        super(size,size);
    }
    public square(String color, boolean filled, double size){
        super(color, filled, size, size);
    }
    public double getSize() {
        return super.getWidth();
    }

    public void setSize(double size) {
        super.setWidth(size);
        super.setHeight(size);
    }

    @Override
    public void setWidth(double width) {
        setSize(width);
    }

    @Override
    public void setHeight(double height) {
        setSize(height);
    }

    @Override
    public String toString() {
        return "square{" + getSize() + "}" + super.toString();
    }
}
