import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Operacoes op = new Operacoes();

        Scanner scanner = new Scanner(System.in);

        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble();

        double resultado = op.somar(numero1, numero2);

        System.out.println(resultado);

    }
}