package Exercicio_16;

public class Main {
    public static void main (String[] args){
        Filme f1 = new Filme("Java: O filme!", 120, 50);

        

        System.out.println("O valor do ingresso para o filme" + f1.getTitulo() + "É de R$ " + f1.getPrecoIngresso());
    }
}
