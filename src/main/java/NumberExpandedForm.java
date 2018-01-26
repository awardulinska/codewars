public class NumberExpandedForm {
    public static String expandedForm(int num) {
        int[] digits = Integer.toString(num).chars().map(c -> c -= '0').toArray();

        StringBuilder result = new StringBuilder();
        int digit;

        for (int i = 0; i <= digits.length - 1; i++) {
            if (digits[i] != 0) {
                digit = (int) (digits[i] * (Math.pow(10, digits.length - i - 1)));
                result.append(digit);
            }
            if (i != digits.length - 1 && digits[i + 1] != 0)
                result.append(" + ");
        }
        return result.toString();
    }
}
