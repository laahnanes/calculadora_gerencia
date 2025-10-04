
public class Operacoes {

    public double somar (double a, double b) {
        return a + b;
    }

    public double subtracao (double a, double b) {
        return a - b;
    }

    public double multiplicar (double a, double b) {
        if (a == 0 && b == 0) {
            return 0;
        }

        if (b == 1) {
            return a;
        }

        return a * multiplicar(a, b - 1);
    }
}