
import java.util.Scanner;

public class vowcons {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        String x = w.nextLine().toLowerCase();
        String c = "";// vowel
        String q = "";// constant
        int v = 0;
        int s = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'a' || x.charAt(i) == 'e' || x.charAt(i) == 'i' || x.charAt(i) == 'o'
                    || x.charAt(i) == 'u')
                c = c + x.charAt(i);
            else
                q += x.charAt(i);
        }
        System.out.println("vowel =  " + c + "  constant =  " + q);

        s = x.replaceAll("[aeiou]", "").length();
        System.out.println("constant = " + s);
        System.out.println("vowel = " + (x.length() - s));

    }
}
