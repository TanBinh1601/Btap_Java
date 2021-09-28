package baiTapChuong2;

import java.util.Scanner;

public class baiTap3 {
    public static void main(String[] args) {
        final double rate = 23000;
        double usd;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập số tiền cần đổi(USD): ");
        usd = nhap.nextDouble();
        double vnd = usd*rate;
        System.out.println("Số tiền chuyển đổi: " + vnd + "VNĐ");
    }
}
