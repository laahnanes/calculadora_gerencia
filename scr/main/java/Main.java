import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Operacoes operacoes = new Operacoes();

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite a operação (+. -, *, /, ^, r): ");
        char operacao = scanner.next().charAt(0);

        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

            switch (operacao) {
                case '+':
                    resultado = operacoes.somar(num1, num2);
                    break;
                case '-':
                    resultado = operacoes.subtracao(num1, num2);
                    break;
                case '*':
                    resultado = operacoes.multiplicar(num1, num2);
                    break;
                case '/':
                    resultado = operacoes.divisao(num1, num2);
                    break;
                case '^':
                    resultado = operacoes.potencia(num1, num2);
                    break;
                case 'r':
                    resultado = operacoes.raizQuadrada(num1, num2);
                    break;
                default:
                    System.out.println("Operação incorreta.");
                    return;
            }
            System.out.println("O resultado é: " + String.format("%.2f" ,resultado));

        scanner.close();

    }
}