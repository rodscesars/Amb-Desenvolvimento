import java.util.Scanner;

public class CalculoIdade {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        Scanner scanner = new Scanner(System.in);


        double distancia;
        double tempo;
        double velocidade;

        System.out.println("Digite 1 para calcular a velocidade e 2 pra calcular distância ");
        opcao = scanner.nextLine();
         // calculo para decobrir velocidade
        if(opcao = 1){
        System.out.println("Digite a distância percorrida ");
        distancia = scanner.nextLine();

        System.out.println("Digite o tempo final ");
        tempo = scanner.nextLine();
        scanner.nextLine();

        double velocidade = distancia/tempo;

        System.out.println("A velocidade média é de"+ velocidade);
         scanner.close()
}
        // calculo para decobrir a distância
           
        if(opcao = 2){
        System.out.println("Digite a velocidae média");
        distancia = scanner.nextLine();

        System.out.println("Digite o tempo final ");
        tempo = scanner.nextLine();
        scanner.nextLine();

        double  distancia= velocidade * tempo;

        System.out.println("A distância percorrida foi de "+ distancia);
        scanner.close();
    }
}
