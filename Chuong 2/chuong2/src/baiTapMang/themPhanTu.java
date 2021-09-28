package baiTapMang;

import java.util.Scanner;

public class themPhanTu {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int[] arr = new int[10];
        int n, x, vt;
        System.out.println("Nhập số phần tử: ");
        n = nhap.nextInt();
        for (int i = 1; i<=n; i++){
            System.out.println("Nhập phần tử thứ " +i+" : ");
            arr[i-1] = nhap.nextInt();
        }
        for (int i = 0; i<arr.length; i++){
            System.out.printf(" | " + arr[i]);
        }
        System.out.println("\nNhập số cần chèn: ");
        x = nhap.nextInt();
        System.out.println("Nhập vị trí cần chèn: ");
        vt = nhap.nextInt();
        for (int j = 0; j<arr.length; j++){
            if (j+1 == vt){
                for (int k = arr.length-1; k >=j; k--) {
                    arr[k] = arr[k-1];
                }
                arr[j] = x;
            }
        }
        for (int i = 0; i<arr.length; i++){
            System.out.printf(" | " + arr[i]);
        }
    }
}