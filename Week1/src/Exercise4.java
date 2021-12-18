import  java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        int number = enterNumber();
        numberToVietnameseWords(number);
    }


    public static int enterNumber(){
        System.out.print("Enter number: ");
        int number = new Scanner(System.in).nextInt();
        while (number>9999){
            System.out.print("Request re-enter number: ");
            number = new Scanner(System.in).nextInt();
        }
        return number;
    }

    public static void numberToVietnameseWords(int number){
        String strNumber = String.valueOf(number);
        String numberWolds[] = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String units[] = {"mươi", "trăm", "nghìn"};
        String readNumber = numberWolds[number%10];

        for (int i = 0; i < strNumber.length()-1; i++ ){ // -1 vì bỏ số ban đầu đã đọc
            number = number /10;
            readNumber = numberWolds[number%10] + " "+ units[i]+" "+ readNumber;
        }
        System.out.println(readNumber);
    }
}