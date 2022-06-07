public class Calculadora {
    
    public Calculadora(){}

    public double soma(double valor1, double valor2){
        return valor1 + valor2;
    }

    public double subtracao(double valor1, double valor2){
        return valor1 - valor2;
    }

    public double divisao(double valor1, double valor2){
        return valor1 / valor2;
    }

    public double multiplicacao(double valor1, double valor2){
        return valor1 * valor2;
    }

    public double exponencial(double base, double expoente){
        return Math.pow(base, expoente);
    }

    public double raizQuadrada(double valor1){
        return Math.sqrt(valor1);
    }

    public double piso(double valor1){
        return Math.floor(valor1);
    }

    public double teto(double valor1){
        return Math.ceil(valor1);
    }


}