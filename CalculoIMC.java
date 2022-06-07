import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        Scanner scanner = new Scanner(System.in);

        String nome;
        Double peso;
        Double altura;
        Double IMC;

        System.out.println("Digite o seu nome:");
        nome = scanner.nextLine();

        System.out.println("Digite o seu peso:");
        peso = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite a sua altura:");
        altura = scanner.nextDouble();

        IMC = calculadora.divisao(peso, calculadora.exponencial(altura, 2));

        if (IMC >= 30) {
            System.out.println(nome + ", você está acima do peso");
        } else {
            System.out.println(nome + ", você não está acima do peso");
        }

        scanner.close();
    }
}
