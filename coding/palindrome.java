
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String a = x.nextLine();
        String pal = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            pal += a.charAt(i);
        }
        System.out.println((x.equals(pal)) ? "PALINDROME" : "NOT PALINDROME");
    }
}