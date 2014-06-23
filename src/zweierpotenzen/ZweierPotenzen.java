package zweierpotenzen;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Erstellt von Felix Klotzsche am 23.06.2014.
 */
public class ZweierPotenzen {
    public static void main(String[] args){
        final ArrayList<Integer> squares = new ArrayList<>();

        Stream.iterate(1, i -> i + 1)
              .limit(20)
              .mapToInt(i -> (int) Math.pow(2, i))
              .forEach(squares::add);

        squares.stream().forEach(System.out::println);
    }
}
