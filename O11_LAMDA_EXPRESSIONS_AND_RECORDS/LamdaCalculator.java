package O11_LAMDA_EXPRESSIONS_AND_RECORDS;

@FunctionalInterface
interface Calculator {
    int operator(int a, int b);
}

public class LamdaCalculator {
    public static int calculate(int x, int y, Calculator c) {
        return c.operator(x, y);
    }

    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator mul = (a, b) -> {
            int res = a * b;
            return res;
        };
        int res1 = calculate(10, 5, add);
        int res2 = calculate(10, 5, sub);
        int res3 = calculate(10, 5, mul);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
