public class Factorial {

    public static int factorialCount(int n) {

        int multiply = 1;
        for (int i = 1; i <= n; i++) {

            multiply *= i;
        }

        return multiply;
    }
}