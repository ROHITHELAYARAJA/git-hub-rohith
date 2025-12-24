
import java.util.Scanner;

public class reco {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String q = a.nextLine();
        String z[] = q.split(" ");
        for (int i = z.length - 1; i >= 0; i--) {
            System.out.print(z[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }

    }
}
