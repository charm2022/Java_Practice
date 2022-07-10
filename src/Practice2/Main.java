package Practice2;

import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        n = 6;
        m = 8;
        System.out.println("First Number (n): " +n);
        System.out.println("Second number (m): " +m);
        int power = 1;
        for (int i = 1; i<=m; i++) {
            power = power*i;

        }
        System.out.println(n + " raise to the power of " +m+ " is " + power);
    }

}
