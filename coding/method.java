import java.time.LocalTime;

public class method {

    public static void main(String[] args) {
        add(13, 68);
        int res = sqr(25);
        System.out.println(" squrede value is " + (res));
        System.out.println(LocalTime.now());
        bad(5);
    }

    public static void add(int d, int f) {
        int c = d + f;
        System.out.println("The sum is: " + c);

    }

    public static int sqr(int a) {
        return a * a;
    }

    public static void bad(int n) {
        if (n <= 0)
            return;
        System.out.println(n);
        bad(n - 1);
    }

}