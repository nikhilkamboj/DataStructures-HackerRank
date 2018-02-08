package questions;

public class Fibonacci {

    private int iterativeFibonacci(int number) {
        int firstInitial = 0;
        int secondInitial = 1;
        int indexer = 3;
        int valueAtPosition = 0;

        for (int i = indexer; i <= number; i++) {
            valueAtPosition = firstInitial + secondInitial;
            firstInitial = secondInitial;
            secondInitial = valueAtPosition;
        }

        return valueAtPosition;
    }



    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.iterativeFibonacci(7));
    }

}
