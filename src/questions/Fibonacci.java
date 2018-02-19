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


    private int findFibonacciValue(int number) {
        if (number <= 0){
            return 0;
        }

        if (number == 1) {
            return 1;
        }

        return findFibonacciValue(number-1) + findFibonacciValue(number-2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.findFibonacciValue(41));
    }

}
