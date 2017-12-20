import java.util.Arrays;

public class HighestAndLowest {
    public static String HighAndLow(String numbers) {

        int highest = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .max()
                .getAsInt();

        int lowest = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .min()
                .getAsInt();
        return String.format("%d %d", highest, lowest);
    }
}
