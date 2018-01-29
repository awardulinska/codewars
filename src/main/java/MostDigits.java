public class MostDigits {
    public static int findLongest(int[] numbers) {

        int length;
        int maxLength = 0;
        int longestNumber = 0;

        for (int number : numbers) {
            int absoluteValue = Math.abs(number);
            length = String.valueOf(absoluteValue).length();
            if (length > maxLength) {
                maxLength = length;
                longestNumber = number;
            }
        }
        return longestNumber;
    }

    // KRÓCEJ:
//        int maxIndex = 0;
//        for (int i = 0; i <numbers.length; i++){
//        if (String.valueOf(Math.abs(numbers[i])).length() > String.valueOf(Math.abs(numbers[maxIndex])).length()){
//            maxIndex = i;
//        }
//    }
//        return numbers[maxIndex];
//}
}