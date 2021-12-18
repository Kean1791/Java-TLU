import  java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        int numberByte = enterNumber();
        System.out.println(convertedBytes(numberByte));
    }

    /**
     * Enter number
     * @return Number byte from terminal
     */
    public static int enterNumber(){
        System.out.print("Enter number: ");
        int number = new Scanner(System.in).nextInt();
        return number;
    }

    /**
     *
     * @param Number Byte
     * @return Byte converted
     */
    public static String convertedBytes(int numberByte ){
        int GB = numberByte / 1_000_000_000;
        int MB = (numberByte - GB*1_000_000_000) / 1_000_000;
        int KB = (numberByte - GB*1_000_000_000 - MB*1_000_000) / 1024;
        int Byte = (numberByte - GB*1_000_000_000 - MB*1_000_000) % 1024;

        String result ="";
        result += GB > 0? GB+"GB + ":"";
        result += MB > 0? MB+"MB + ":"";
        result += KB > 0? KB+"KB + ":"";
        result += Byte > 0? Byte+"Byte":"";

        return result;
    }

}