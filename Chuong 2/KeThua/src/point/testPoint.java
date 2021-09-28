package point;

public class testPoint {
    public static void main(String[] args) {
        point2D p2D = new point2D(6, 9);
        point3D p3D = new point3D(p2D.getX(), p2D.getY(), 2);
        float[] arr1, arr2;
        arr1 = p2D.getXY();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
        System.out.println();
        System.out.println(p2D.toString());
        arr2 = p3D.getXYZ();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }
        System.out.println();
        System.out.println(p3D.toString());
    }
}
