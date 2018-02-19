package questions;

public class FibonacciMemorization {

    private static final int MAX = 100;
    private static final int NIL = 0;

    private int[] lookup = new int[MAX];

    public int fibVal(int number) {
        if (lookup[number] == NIL) {
            if (number <= 1) {
                return number;
            } else {
                lookup[number] = fibVal(number-1) + fibVal(number-2);
            }
        }
        return lookup[number];
    }

    public static void main(String[] args) {
        FibonacciMemorization fibonacciMemorization = new FibonacciMemorization();
        System.out.println(fibonacciMemorization.fibVal(41));
    }
}
