public class recu {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fact(n));
    }

    static int fact(int a) {
        if (a == 0)
            return 1;
        return a * fact(a - 1);
    }
}
