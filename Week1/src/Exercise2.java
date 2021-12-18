import  java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args){
        System.out.print("Enter number: ");
        int number = new Scanner(System.in).nextInt();
        if(checkIsStrPalindrome(number))
            System.out.println("Number is Palindrome Number");
        else
            System.out.println("Number isn't Palindrome Number");
    }


    public static boolean checkIsStrPalindrome(int number){
        String str = String.valueOf(number);
        String reverse = new StringBuffer(str).reverse().toString();
        int numberReverse = Integer.parseInt(reverse);

        Boolean check = number == numberReverse ? true:false;
        return check;
    }
}
