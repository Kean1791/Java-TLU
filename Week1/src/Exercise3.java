import  java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int number = new Scanner(System.in).nextInt();
//        String number = new Scanner(System.in).nextLine();  // Input String
        if(isPrimeNumber(number))
            System.out.println("Number is Prime Number");
        else
            System.out.println("Number isn't Prime Number");
    }
    public static boolean isPrimeNumber(int number){
        for(int i = 2; i< number ; i++){
            if(number%i ==0) return false;
        }
        return true;
    }
    public static boolean isPrimeNumber(float number){
        for(int i = 2; i< number ; i++){
            if(number%i ==0) return false;
        }
        return true;
    }
    public static boolean isPrimeNumber(double number){
        for(int i = 2; i< number ; i++){
            if(number%i ==0) return false;
        }
        return true;
    }
    public static boolean isPrimeNumber(long number){
        for(int i = 2; i< number ; i++){
            if(number%i ==0) return false;
        }
        return true;
    }
    public static boolean isPrimeNumber(String str){
        int number = Integer.parseInt(str);
        for(int i = 2; i< number ; i++){
            if(number%i ==0) return false;
        }
        return true;
    }

}
