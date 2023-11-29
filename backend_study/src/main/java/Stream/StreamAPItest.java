package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamAPItest {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int even =0;
        IntStream stream = Arrays.stream(numbers);

        int sumOfEvens = Arrays.stream(numbers)
                        .filter(n->n%2==0)
                                .sum();
        System.out.println(sumOfEvens);
    }
}
