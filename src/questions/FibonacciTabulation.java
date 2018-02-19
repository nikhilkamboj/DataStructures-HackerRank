package questions;

public class FibonacciTabulation {

    public int fibVal(int number) {
        int[] fibArray = new int[number+1];
        fibArray[0] = 0;
        fibArray[1] = 1;

        for (int i = 2; i < fibArray.length; i++) {
            fibArray[i] = fibArray[i-1] + fibArray[i-2];
        }
        return fibArray[number];
    }

    public static void main(String[] args) {
        FibonacciTabulation fibonacciTabulation = new FibonacciTabulation();

        System.out.println(fibonacciTabulation.fibVal(40));
    }
}
