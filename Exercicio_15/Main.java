package Exercicio_15;
// Exercício para praticar encapsulamento
public class Main {

    public static void main(String[] args){
        Personagem personagem = new Personagem("Aragorn", 100);
        Personagem personagem2 = new Personagem("Legolas", 80);
        
        personagem.receberDano(8);
        System.out.println("A vida atual do seu personagem é: " + personagem.getVida());
        
    }
}
