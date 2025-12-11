package estruturas.de.dados.fibonacci;

public class Main {

    public static int fibonacci(int value) {
        if (value <= 1) {
            return value;
        }

        int a = 0;
        int b = 1;

        for (int i = 2; i <= value; i++) {
            int next = a + b;
            a = b;
            b = next;
        }

        return b;
    }

    public static int fibonacciD(int value) {
        if (value <= 1) {
            return value;
        }

        // 0 = 0
        // 1 = 1
        // 2 = 1
        // 3 = 2
        // 4 = 3
        int previous = 0;
        int current = 1;
        for (int i = 0; i <= value; i++) {
            int next = current + previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public static void main(String[] args) {
        System.out.println(fibonacciD(0));
        System.out.println(fibonacciD(1));
        System.out.println(fibonacciD(2));
        System.out.println(fibonacciD(3));
        System.out.println(fibonacciD(4));
        System.out.println(fibonacciD(5));
        System.out.println(fibonacciD(6));

    }
}
