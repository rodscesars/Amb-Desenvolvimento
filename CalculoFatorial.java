import java.util.scanner;

public class Fatorial {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        Scanner scanner = new Scanner(System.in);

        double x = numero;

        System.out.println("Digite o número: ");
        nome = scanner.nextLine();
        scanner.nextLine(); 

        double f = x;

        while(x > 1){
            f= calculadora.multiplicacao(f,(calculadora.subtracao(x,1)));
            x--;
        }
        
        System.out.println("O Fatorial do número "+ numero + "\né " + f );
        scanner.close();
}
