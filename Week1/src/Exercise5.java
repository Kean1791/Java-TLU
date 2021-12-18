import  java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        int numberA = enterNumber("A");
        int numberB = enterNumber("B");
        System.out.println(greatestCommonDivisor(numberA,numberB));
        System.out.println(leastCommonMultiples(numberA,numberB));
    }

    public static int enterNumber(String str){
        System.out.print("Enter number"+ str +": ");
        int number = new Scanner(System.in).nextInt();
        return number;
    }

    public static int greatestCommonDivisor(int numberA, int numberB){
        if(numberB ==0 ) return numberA;
        return greatestCommonDivisor(numberB,numberA%numberB); // Euclid
    }
    public static int leastCommonMultiples(int numberA, int numberB){
        return (numberA*numberB)/greatestCommonDivisor(numberA,numberB);
    }
}