import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        Scanner scanner = new Scanner(System.in);

        String nome;
        Double relatorio1, relatorio2, relatorioFinal, soma, media;

        System.out.println("Digite o seu nome:");
        nome = scanner.nextLine();

        System.out.println("Digite a nota do relatório 1:");
        relatorio1 = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Digite a nota do relatório 2:");
        relatorio2 = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Digite a nota do relatório final:");
        relatorioFinal = scanner.nextDouble();

        scanner.nextLine();

        soma = calculadora.soma(calculadora.soma(relatorio1, relatorio2), relatorioFinal);
        media = calculadora.divisao(soma, 3);

        System.out.println("A sua média foi: " + media);
        if (media >= 8) {
            System.out.println("Parabéns, " + nome + " você foi aprovado!");
        } else {
            System.out.println(nome + ", você foi reprovado!");
        }

        scanner.close();
    }
}