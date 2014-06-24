package Mathe;

import static java.util.stream.IntStream.rangeClosed;

/**
 * Erstellt von Felix Klotzsche am 24.06.2014.
 */
public class Mathe {

    public static void main(String[] args) {
        final double wert = 5.0 / 3.0;
        System.out.println(wert);

        System.out.println("1.0 + 2.0 = " + add(1.0, 2.0));

        final double x = 5.0;
        System.out.println(" " + x + " + 2.0 = " + add(x, 2.0));
        System.out.println(" 2.0 + " + x + " = " + add(2.0, x));
        final double y = add(x, 2.0);
        System.out.println(y);

        // test, ob sub auch richtig funktioniert
        System.out.println(x == sub(x, y) + y);

        System.out.println(mul(5, 3));  // sollte 15 sein
        System.out.println(mul(5, -3));  // sollte 15 sein
        System.out.println(pow(2, 3));  // sollte 8 sein
        System.out.println(pow(2, -3)); // sollte 0.0 sein
        System.out.println(pow(2, 0));  // sollte 1 sein
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double sub(double x, double y) {
        return add(x, -y);
    }

    public static double mul(int x, int y) {
        return rangeClosed(1, y)
                .mapToDouble(i -> add(x, 0))
                .sum();
    }

    public static double pow(int basis, int exponent) {
        if (exponent < 0) // wenn es ein negativer exponent ist
            return 1 / pow(basis, -exponent);
        return rangeClosed(1, exponent)
                .mapToDouble(i -> mul(basis, 1))
                .reduce((acc, mul) -> acc *= mul)
                .orElse(1.0); // wenn weder negativ, noch positiver > 0, dann 1.0
    }
}
