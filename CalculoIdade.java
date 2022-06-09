import java.util.Scanner;

public class CalculoIdade {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        Scanner scanner = new Scanner(System.in);

        String nome;
        int ano_nascimento;
        int ano;

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.println("O seu ano de nascimento é: ");
        ano_nascimento = scanner.nextInt();

        System.out.println("O ano que você está: ");
        ano = scanner.nextInt();

        scanner.nextLine();

        double subtracao = calculadora.subtracao(ano,ano_nascimento);

        System.out.println("Olá, " + nome + "!" +"\nVocê tem " + subtracao + " anos...");

        scanner.close();
    }
}
