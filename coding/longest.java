
import java.util.Scanner;

public class longest {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String a = x.nextLine();
        String[] arr = a.split(" ");
        int max = arr[0].length();
        String q = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max)
                max = arr[i].length();
            q = arr[i];
        }
        System.out.println("TOTAL LENGTH = " + max);
        System.out.println("MAXI STRING = " + q);
    }
}