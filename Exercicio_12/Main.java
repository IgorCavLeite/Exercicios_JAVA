package Exercicio_12;
//Exercício métodos recursivos
public class Main {
    static void regressiva(int n){
        if(n == 0){
            System.out.println("Fogo!");
            return;
        }

        System.out.println(n);
        regressiva(n-1);
    }

    public static void main (String[] args){
        regressiva(10);
    }
}

