package resizeable;

public class testResizeable {
    public static void main(String[] args) {
        shape[] shapes = new shape[3];
        shapes[0] = new circle(10);
        shapes[1] = new rectangle(10, 20);
        shapes[2] = new square(10);

        double resizePercent = Math.random() * 100;
        System.out.println("Resize percent: " + resizePercent + "% \n----------");
        for (shape s : shapes) {
            if (s instanceof circle) {
                System.out.println("Diện tích hình tròn trước khi resize: " + ((circle) s).getArea());
                ((circle) s).resize(resizePercent);
                System.out.println("Diện tích hình tròn sau khi resize: " + ((circle) s).getArea() + "\n----------");
            } else if (s instanceof square) {
                System.out.println("Diện tích hình vuông trước khi resize: " + ((square) s).getArea());
                ((square) s).resize(resizePercent);
                System.out.println("Diện tích hình vuông sau khi resize: " + ((square) s).getArea() + "\n----------");
            }else if (s instanceof rectangle){
                System.out.println("Diện tích hình chữ nhật trước khi resize: " + ((rectangle) s).getArea());
                ((rectangle) s).resize(resizePercent);
                System.out.println("Diện tích hình chữ nhật sau khi resize: " + ((rectangle) s).getArea() + "\n----------");
            }
        }
    }
}
