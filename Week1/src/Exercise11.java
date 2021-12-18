import java.util.Scanner;
import  java.util.Arrays;

public class Exercise11 {
    public static void main(String[] args) {
        int array[] = enterArray();
//      printArray(array);
        System.out.println("MAX: "+findMIN(array));
        System.out.println("MAX: "+findMAX(array));
        Arrays.sort(array);
        printArray(array);
    }

    /**
     * Enter array
     * @return Number from terminal
     */
    public static int[] enterArray() {
        System.out.print("Enter n : ");
        int n = new Scanner(System.in).nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = new Scanner(System.in).nextInt();
        }
        return array;
    }

    /**
     * Print array
     * @param array
     */
    public  static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    /**
     *
     * @param array
     * @return Number Max
     */
    public  static int findMAX(int[] array){
        int MAX = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(MAX < array[i] ) MAX = array[i];
        }
        return MAX;
    }
    /**
     *
     * @param array
     * @return Number MIN
     */
    public  static int findMIN(int[] array){
        int MIN = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(MIN > array[i] ) MIN = array[i];
        }
        return MIN;
    }


}