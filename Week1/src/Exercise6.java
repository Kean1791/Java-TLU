import  java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        int n = enterNumber();
        printPrimeNumber(n);
    }

    public static int enterNumber(){
        System.out.print("Enter number: ");
        int number = new Scanner(System.in).nextInt();
        return number;
    }
    public static boolean isPrimeNumber(int number){
        for(int i = 2; i < number ; i++){
            if(number%i ==0) return false;
        }
        return true;
    }
    public static void printPrimeNumber(int n){
        System.out.print("Prime Number: ");
        for(int i = 1; i <= n; i++){
            if(isPrimeNumber(i))
                System.out.print( i +" ");
        }
    }
}