package baiTapMang;

import java.util.Scanner;

public class phanTuMin {
    public static int[] nhapmang(String name){
        Scanner nhap = new Scanner(System.in);
        int n;
        System.out.println("Nhập số phần tử "+name+": ");
        n = nhap.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<arr.length; i++){
            System.out.println("Nhập phần tử thứ " +(i+1)+" : ");
            arr[i] = nhap.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = nhapmang("mãng");
        int min = arr[0];
        for (int i=0; i<arr.length; i++){
            if (min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất: "+min);
    }
}
