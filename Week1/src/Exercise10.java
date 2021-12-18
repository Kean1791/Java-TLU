import  java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args){
        System.out.print("Enter N: ");
        int N = new Scanner(System.in).nextInt();
        double Sum = 0;
        for(int i = 1; i <= N; i++){
            Sum += 1.0/(2d*i);
        }
        System.out.println("S(N) = " + Sum);
    }
}
