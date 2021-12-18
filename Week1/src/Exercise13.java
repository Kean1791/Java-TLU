import java.util.Scanner;
import java.util.HashMap;

public class Exercise13 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        String strSplit[] = str.split(" "); // Converted String to Array of Words

        HashMap<String, Integer> COUNT = new HashMap<String, Integer>();
        for (String key:
                strSplit) {
            if(!COUNT.keySet().contains(key))  COUNT.put(key,0); // set Key
            COUNT.computeIfPresent(key,(k,v)->v+1); // Update value
        }
        // Print
        for (String key:
                COUNT.keySet()) {
            System.out.println( key + ": " + COUNT.get(key));
        }
    }
//
}
