package baiTapMang;

import java.util.Scanner;

public class xoaPhantu {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int[] arr;
        int n, x;
        System.out.println("Nhập số phần tử: ");
        n = nhap.nextInt();
        arr = new int[n];
        for (int  i = 1; i<=n; i++){
            System.out.println("Nhập phần tử thứ "+ i+ " : ");
            arr[i-1] = nhap.nextInt();
        }
        for (int i = 0; i<arr.length; i++){
            System.out.printf(" | " + arr[i]);
        }
        System.out.println("\nNhập phần tử cần xóa: ");
        x = nhap.nextInt();
        for (int j = 0; j<arr.length; j++){
            if (x == arr[j]){
                for(int k = j; k<arr.length - 1; k++){
                    arr[k] = arr[k+1];
                }
                arr[arr.length-1]=0;
                j = 0;
            }
        }
        for (int i = 0; i<arr.length; i++){
            System.out.printf(" | " + arr[i]);
        }
    }
}
