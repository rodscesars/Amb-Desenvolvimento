import java.util.Scanner;

public class Areas {

    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        Scanner prompt = new Scanner(System.in);
        int opcao = -1;
        double valor1, valor2, base, expoente, area;
        String msg1, msg2;
        
        do{

            System.out.println("#### MENU #####");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Triângulo");
            System.out.println("4 - Círculo");
            System.out.println("0 - Sair");
            System.out.print("Escolha a forma geométrica que deseja calcular a área: ");
            opcao = prompt.nextInt();

            msg1 = "Informe o comprimento do primeiro lado: "; 
            msg2 = "Informe o comprimento  do segundo lado: ";
            
            
            if(opcao == 3) {
                msg1 = "informe o comprimento da base do triângulo: ";
                msg2 = "informe o comprimento da altura do triângulo: ";
            }

            if(opcao == 4) {
                msg1 = "Informe o raio do círculo: ";
            }
            
            if(opcao == 0){
                System.out.println("saindo...");
                break;
            }

            System.out.println(msg1);
            valor1 = prompt.nextInt();
           
            
            if(opcao < 4){
                System.out.println(msg2);
                valor2 = prompt.nextInt();
            } else {
                valor2 = 0;
            }

            switch (opcao) {
                case 1:
                    area = calc.multiplicacao(valor1, valor2);
                    System.out.println("A área é " + area + " m2.");
                    break;
                case 2:
                    area = calc.multiplicacao(valor1, valor2);
                    System.out.println("A área é " + area + " m2.");
                    break;
                case 3:
                    area = calc.divisao(calc.multiplicacao(valor1, valor2),2);
                    System.out.println("A área é " + area + " m2.");
                    break;
                case 4:
                    //area = calc.multiplicacao(calc.exponencial(45, 2), Math.PI);
                    area = calc.multiplicacao(calc.exponencial(valor1, 2), Math.PI);
                    System.out.println("A área é " + area + " m2.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while(true);
        
    }
}
