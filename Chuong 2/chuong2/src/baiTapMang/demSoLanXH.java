package baiTapMang;

import java.util.Scanner;

public class demSoLanXH {
    public static int dem(String str, char chr){
        int tg = 0;
        for (int i = 0; i < str.length(); i++)
            if (chr == str.charAt(i))
                tg++;
        return tg;
    }

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = nhap.nextLine();
        System.out.println("Nhập kí tự cần đếm: ");
        char chr = nhap.next().charAt(0);
        int tg = dem(str, chr);
        System.out.print("Số lần xuất hiện " + chr + " : " + tg);
    }
}
