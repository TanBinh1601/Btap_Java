package lopDoiTuong;

import java.util.Scanner;

public class phuongTrinhBac2 {
    private int a;
    private int b;
    private int c;
    public phuongTrinhBac2(){

    }
    public phuongTrinhBac2(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public float getDiscriminant(){
        float delta;
        delta = (float) (Math.pow(b, 2) - (4*a*c));
        return  delta;
    }

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int a, b, c;
        float x1, x2;
        System.out.println("Nhập a: ");
        a = nhap.nextInt();
        System.out.println("Nhập b: ");
        b = nhap.nextInt();
        System.out.println("Nhập c: ");
        c = nhap.nextInt();
        phuongTrinhBac2 pt = new phuongTrinhBac2(a, b, c);
        float dt = pt.getDiscriminant();
        System.out.println("Delta : " + dt);

        if(a==0)
            if(b==0)
                if(c==0){
                    System.out.println("Phuong trinh vo so nghiem");
                }
                else{
                    System.out.println("Phuong trinh vo nghiem");
                }
            else{
                System.out.println("Phuong trinh co nghiem="+ (-c/b));
            }
        else{
            if (dt>0){
                x1 = (float) ((-b + Math.sqrt(dt))/(2*a));
                x2 = (float) ((-b - Math.sqrt(dt))/(2*a));
                System.out.println("Phương trình có 2 nghiệm: ");
                System.out.println("x1: " + x1);
                System.out.println("x2: " + x2);
            }
            else if (dt==0){
                x1 = x2 = (-b)/(2*a);
                System.out.println("Phương trình có 1 nghiệm: " + x1);
            }
            else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
