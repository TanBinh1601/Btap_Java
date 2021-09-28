package colorable;

import resizeable.*;
public class TestColorable {
    public static void main(String[] args) {
        shape[] shapes = new shape[3];
        shapes[0] = new circle(10);
        shapes[1] = new rectangle(10, 20);
        shapes[2] = new Square(10);
        for (shape s : shapes){
            if (s instanceof Colorable){
                ((Colorable)s).howToColor();
            }
        }
    }
}
