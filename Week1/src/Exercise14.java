import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        System.out.print("Enter string 1:");
        String str1 = new Scanner(System.in).nextLine();
        System.out.print("Enter string 2:");
        String str2 = new Scanner(System.in).nextLine();
        System.out.print(str1.contains(str2)?"Yes":"No");
    }

}
