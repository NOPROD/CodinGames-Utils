import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class utils {

    // --------------- FIND SUM ---------------

    public static int findSumWithoutUsingStream(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static int findSumUsingStream(int[] array) {
        return Arrays.stream(array).sum();
    }

    public static int findSumUsingStream(Integer[] array) {
        return Arrays.stream(array).mapToInt(Integer::intValue).sum();
    }

    // --------------- FIND Average ---------------

    public static double findAverageWithoutUsingStream(int[] array) {
        int sum = findSumWithoutUsingStream(array);
        return (double) sum / array.length;
    }

    public static double findAverageUsingStream(int[] array) {
        return Arrays.stream(array).average().orElse(Double.NaN);
    }

    // --------------- Calculate Factorial ---------------

    public static long factorialStreams(long n) {
        return LongStream.rangeClosed(1, n).reduce(1, (long a, long b) -> a * b);
    }

    // --------------- FIND Element in Array ---------------
    public static boolean isIntInArray(int[] arr, int toCheckValue) {
        return IntStream.of(arr).anyMatch(x -> x == toCheckValue);
    }

}