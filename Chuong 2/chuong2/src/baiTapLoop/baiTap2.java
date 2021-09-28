package baiTapLoop;

public class baiTap2 {
    public static void main(String[] args) {
        int n = 1;
        int count = 0;
        while (count<20){
            int tg = 0;
            for (int i = 1; i<=n; i++){
                if (n%i==0){
                    tg = tg+1;
                }
            }
            if (tg<=2){
                System.out.println(" " + n);
                count++;
            }
            n++;
        }
    }
}
