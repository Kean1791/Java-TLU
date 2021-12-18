import  java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args){

        System.out.println("Enter N: ");
        int n = new Scanner(System.in).nextInt();
        int sum =0;
        for (int i = 1 ; i <= n; i++){
            sum += 2*i - 1 ;
            System.out.println(sum);
        }
        System.out.println("N="+sum);
    }
}
