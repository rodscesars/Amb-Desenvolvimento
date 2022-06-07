import java.util.Scanner;

public class Volumes {
 
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        Scanner prompt = new Scanner(System.in);
        int opcao = -1;
        double valor1, valor2, altura, area, volume;
        String msg1, msg2, msg3;
        
        do{

            System.out.println("#### MENU #####");
            System.out.println("1 - Cubo");
            System.out.println("2 - Cilindro");
            System.out.print("Escolha a forma geométrica que deseja calcular o volume: ");
            opcao = prompt.nextInt();

            msg1 = "Informe o comprimento do primeiro lado: "; 
            msg2 = "Informe o comprimento  do segundo lado: ";
            msg3 = "Informe a altura: ";
            
            
            if(opcao == 2){
                msg1 = "Informe o raio do círculo: ";    
            }

            if(opcao == 0){
                System.out.println("saindo...");
                break;
            }

            System.out.println(msg1);
            valor1 = prompt.nextInt();

            if(opcao ==1){
                System.out.println(msg2);
                valor2 = prompt.nextInt();
            } else {
                valor2 = 0;
            }

            System.out.println(msg3);
            altura = prompt.nextInt();

            switch (opcao) {
                case 1:
                    area = calc.multiplicacao(valor1, valor2);
                    volume = calc.multiplicacao(area, altura);
                    System.out.println();
                    System.out.println("O volume é " + volume + " m3.");
                    System.out.println();
                    break;
                case 2:
                    area = calc.multiplicacao(calc.exponencial(valor1, 2), Math.PI);
                    volume = calc.multiplicacao(area, altura);
                    System.out.println();
                    System.out.println("O volume é " + volume + " m3.");
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while(true);
    }

}
