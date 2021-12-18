import  java.util.Scanner;
import java.util.Stack;
public class Exercise7 {
    public static void main(String[] args) {
        int MAX = Integer.MIN_VALUE;
        int MIN = Integer.MAX_VALUE;
        int SUM = 0;
        int numberEnter;
        int COUNT =0;

        do {
            System.out.print("Enter Number:");
            numberEnter = new Scanner(System.in).nextInt();

            SUM += numberEnter;
            if(MAX < numberEnter )
                MAX = numberEnter;
            if(MIN > numberEnter) {
                if(numberEnter >0)
                MIN = numberEnter;
            }
            COUNT++;
        }while (numberEnter !=0);
        COUNT--; // Delete 0
        System.out.println("MAX = " + MAX);
        System.out.println("MIN = " + MIN);
        System.out.println("SUM = " + SUM);
        System.out.println("AVG = " + SUM/(double)COUNT);
    }
}
