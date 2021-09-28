package baiTapMang;

import java.util.Scanner;

public class gopMang {
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
    public static int[] gopmang(int[] a1, int[] a2){
        int n = a1.length + a2.length;
        int[] arr = new int[n];
        for (int i = 0; i<a1.length; i++){
            arr[i] = a1[i];
        }
        for (int j = 0; j<a2.length; j++){
            arr[a1.length + j] = a2[j];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr1, arr2, arr;
        arr1 = nhapmang("mang 1");
        arr2 = nhapmang("mang 2");
        arr =  gopmang(arr1, arr2);
        for (int i = 0; i<arr.length; i++){
            System.out.printf(" | " + arr[i]);
        }
    }
}
