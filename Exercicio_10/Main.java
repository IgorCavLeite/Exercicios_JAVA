public class Main {
    static double calcularDesconto(double x, double desconto){
        double valorOriginal = x; // O Double valorOriginal recebe o valor de x.
        double valorDesconto = valorOriginal * desconto; // O Double valorDesconto, recebe o cálculo valorOriginal * desconto.
        double valorFinal = valorOriginal - valorDesconto; // o double valorFinal, recebe o resultado de valorOriginal - valorDesconto.
        System.out.println("Valor original: " + valorOriginal);
        System.out.println("Valor do desconto: " + valorDesconto);
        System.out.println("Valor final: " + valorFinal);
        return valorFinal;
        
    }

    public static void main(String[] args) {
        calcularDesconto(100, 0.1);
    }
}