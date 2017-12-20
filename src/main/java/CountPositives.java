
public class CountPositives {
    public static int[] countPositivesSumNegatives(int[] input) {

        if (input == null || input.length == 0) return new int[]{};
        int countElements = 0;
        int sum = 0;
        for (int i = 0; i < input.length; i++) {

                if (input[i] > 0) {
                    countElements++;
                }
                if (input[i] < 0) {
                    sum += input[i];
                }
        }
        return new int[]{countElements, sum};
    }
}

