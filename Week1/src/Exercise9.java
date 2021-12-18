import  java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        int numberSeconds = enterNumber();
        System.out.println(convertedSeconds(numberSeconds));
    }

    /**
     * Enter number seconds
     * @return Number seconds from terminal
     */
    public static int enterNumber(){
        System.out.print("Enter number: ");
        int number = new Scanner(System.in).nextInt();
        return number;
    }

    /**
     * Converted seconds
     * @param Number Seconds
     * @return Number Seconds converted
     */
    public static String convertedSeconds(int numberSeconds ){
        int year = numberSeconds / 31536000;
        int month = (numberSeconds - year*31536000) / 2592000;
        int day = (numberSeconds - year*31536000 - month*2592000) / 86400;
        int hour = (numberSeconds - year*31536000 - month*2592000 - day*86400) / 3600;
        int minute = (numberSeconds - year*31536000 - month*2592000 - day*86400 - hour*3600) / 60;
        int seconds = (numberSeconds - year*31536000 - month*2592000 - day*86400 - hour*3600) % 60;

        String result ="";
        result += year > 0? year+"Year + ":"";
        result += month > 0? month+"Month + ":"";
        result += day > 0? day+"Day + ":"";
        result += hour > 0? hour+"Hour + ":"";
        result += minute > 0? minute+"Minute + ":"";
        result += seconds > 0? seconds+"Seconds":"";

        return result;
    }

}