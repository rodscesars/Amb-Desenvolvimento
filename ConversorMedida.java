import java.util.Scanner;

public class ConversorMedida {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        Scanner prompt = new Scanner(System.in);
        
        int opcao = -1;
        double valor, metros, cm, mm;

        System.out.println("***MENU***" + 
        "\n Olá!" + 
        " Escolha um cálculo de conversão abaixo:" );
        System.out.println("1 - Quilômetro para metros" + 
        "\n2 - Metros para Centímetros" + 
        "\n3 - Centímetros para milímetros");

        opcao = prompt.nextInt();

        System.out.println("Digite o valor a ser convertido: ");
        valor = prompt.nextFloat();

        switch (opcao) {
            case 1:
                metros = calculadora.multiplicacao(valor, 1000);
                System.out.println(valor + " quilomêtros corresponde a " + metros + " metros.");
                break;
            case 2:
                cm = calculadora.multiplicacao(valor, 100);
                System.out.println(valor + " metros corresponde a " + cm + " centímetros.");
                break;
            case 3:
                mm = calculadora.multiplicacao(valor, 10);
                System.out.println(valor + " centímetros corresponde a " + mm + " milímetros.");
                break;
            default:
                System.out.println("A opção digitada é inválida. Tente novamente!!!");
                break;
        }
        prompt.close();
    }
}
