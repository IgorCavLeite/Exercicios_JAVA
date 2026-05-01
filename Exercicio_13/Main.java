package Exercicio_13;
// Prática recursão
public class Main {
    static int somarTudo(int n){
        if (n == 1){
            return 1;
        }

        System.out.println(n);
        return n + somarTudo(n - 1);
    }

    public static void main (String[] args){
        somarTudo(20);
        System.out.println("Resultado final: " + somarTudo(20));
    }
}
