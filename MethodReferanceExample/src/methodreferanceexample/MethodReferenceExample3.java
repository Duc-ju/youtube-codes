package methodreferanceexample;

import java.util.Arrays;
import java.util.stream.Stream;

public class MethodReferenceExample3 {
    public static void main(String[] args) {
        Integer[] longNumbers = {9, 4, 5, 6, 3, 8, 2, 7, 0};
        Arrays.sort(longNumbers, Integer::compare);
        Stream.of(longNumbers).forEach(System.out::print);
    }
}
