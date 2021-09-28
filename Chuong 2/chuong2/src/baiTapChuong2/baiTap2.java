package baiTapChuong2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class baiTap2 {
    public static String docSo(int n){
        String kq = "";
        String[] dv = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String[] c = {"lẻ", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};
        String[] tr = {"không", "một trăm", "hai trăm", "ba trăm", "bốn trăm", "năm trăm", "sáu trăm", "bảy trăm", "tám trăm", "chín trăm"};
         int x , y, z;
         x = n%10;
         n = n/10;
         y = n%10;
         n = n/10;
         z = n%10;
         if (x==0 && y !=0){
             kq = tr[z] + " " + c[y];
         }
         else if (y==0 && z==0){
             kq = dv[x];
         }
         else if (x==0 && y==0){
             kq = tr[z];
         }
         else if (z==0){
            kq =  c[y] + " " + dv[x];
         }
         else {
             kq = tr[z] + " " + c[y] + " " + dv[x];
         }
         return kq;
    }
    public static void main(String[] args) {
        int s;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập sô: ");
        s = nhap.nextInt();
        System.out.println("Kết quả: " + docSo(s));
    }
}
