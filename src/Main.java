import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Digite o primeiro número:");
        double a = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        double b = sc.nextDouble();

        System.out.println("Digite a operação (+ - * /):");
        char operacao = sc.next().charAt(0);

        double resultado = 0;

        if(operacao == '+') {
            resultado = a + b;
        } else if(operacao == '-') {
            resultado = a - b;
        } else if(operacao == '*') {
            resultado = a * b;
        } else if(operacao == '/') {
            resultado = a / b;
        } else {
            System.out.println("Essa operação não é válida para esse sistema");
            return;
        }
        if (Math.floor(resultado) == resultado) {
            System.out.println("O Resultado desejado é: " + (int) resultado);
        } else {
            System.out.printf(Locale.US, "O Resultado desejado é: %.2f\n", resultado);
        }

        sc.close();
    }
}