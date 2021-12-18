import  java.util.Scanner;
public class Exercise12 {
    public static void main(String[] args) {
        System.out.println();
        String string = new Scanner(System.in).nextLine();
        System.out.println(countWords(string));
    }
    public static int countWords(String str){
        int count = 0;
        for(int i = 0; i<str.length(); i++ ){
            if(str.codePointAt(i) == 32) {
                count++;
            }
        }
    return count ;
    }
}
