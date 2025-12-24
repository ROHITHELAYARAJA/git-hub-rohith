
import java.util.Scanner;

public class lowtoupp {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String a = x.nextLine();
        String u = "";
        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
                int q = a.charAt(i) - 32;
                u = u + (char) q;
            } else {
                u = u + (char) a.charAt(i);
            }
        }
        System.out.println(u);
    }

}
