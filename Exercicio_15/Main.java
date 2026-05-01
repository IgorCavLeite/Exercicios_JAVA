package Exercicio_15;

public class Main {

    public static void main(String[] args){
        Personagem personagem = new Personagem("Aragorn", 100);
        Personagem personagem2 = new Personagem("Legolas", 80);
        
        personagem.mostrar();
        personagem2.mostrar();
        System.out.println(Personagem.totalPersonagens);
        
    }
}
