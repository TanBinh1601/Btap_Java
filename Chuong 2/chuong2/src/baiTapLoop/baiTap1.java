package baiTapLoop;

import java.util.Scanner;

public class baiTap1 {
    public static void main(String[] args) {
        int s;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. In hình chữ nhật");
        System.out.println("2. In hình tam giác vuông");
        System.out.println("3. In hình tam giác cân");
        System.out.println("4. Thoát");
        System.out.println("Nhập lựa chọn: ");
        s = nhap.nextInt();
        switch (s){
            case 1:
                int cd, cr;
                System.out.println("Nhập chiều dài: ");
                cd = nhap.nextInt();
                System.out.println("Nhập chiều rộng: ");
                cr = nhap.nextInt();
                for (int i = 1; i<= cr; i++){
                    for (int j = 1; j<=cd; j++){
                        System.out.printf("* ");
                    }
                    System.out.printf("\n");
                }
                break;
            case 2:
                int cc;
                System.out.println("Nhập chiều cao: ");
                cc = nhap.nextInt();
                System.out.println("- Top-left");
                for (int i = cc; i>=1; i--){
                    for (int j = 1; j<=i; j++){
                        System.out.printf("* ");
                    }
                    System.out.printf("\n");
                }
                System.out.println("- Botton-left");
                for (int i = 1; i<=cc; i++){
                    for (int j = 1; j<=i; j++){
                        System.out.printf("* ");
                    }
                    System.out.printf("\n");
                }
                System.out.println("- Top-right");
                for (int i = 1; i<=cc; i++){
                    for (int j = 1; j<=cc; j++){
                        if (i>j){
                            System.out.printf("  ");
                        }
                        else {
                            System.out.printf("* ");
                        }
                    }
                    System.out.printf("\n");
                }
                System.out.println("- Botton-right");
                for (int i = cc; i >= 1; i--) {
                    for (int j = 1; j <= cc; j++) {
                        if (j < i) {
                            System.out.print("  ");
                        } else {
                            System.out.print("* ");
                        }
                    }
                    System.out.print("\n");
                }
                break;
            case 3:
                int h;
                System.out.println("Nhập chiều cao: ");
                h = nhap.nextInt();
                for (int i = h; i >= 1; i--) {
                    for (int j = 1; j <= h; j++) {
                        if (j < i) {
                            System.out.print(" ");
                        } else {
                            System.out.print("* ");
                        }
                    }
                    System.out.print("\n");
                }
                break;
            case 4:
                System.exit(0);

        }
    }
}
