import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k=0,j=-1;
        for (int i = 0; i<=60; i++){
            if(i%3==0 && i%4==0){
                k= k+i;
                j++;
            }
        }
        k = k/j;
        System.out.print("3 ve 4 e tam bölünen sayıların ortalaması: "+k);
    }
}