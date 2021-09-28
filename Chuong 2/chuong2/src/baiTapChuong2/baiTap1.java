package baiTapChuong2;

import java.util.Scanner;

public class baiTap1 {
    public static void main(String[] args) {
        System.out.println("Nhập tên: ");
        String name;
        Scanner nhap = new Scanner(System.in);
        name = nhap.nextLine();
        System.out.println("Hello " + name);
    }
}
