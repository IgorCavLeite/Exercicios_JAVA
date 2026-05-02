package Exercicio_15;

public class Guerreiro extends Personagem {
    private int armadura;

    public Guerreiro(String nome, int vida, int armadura){
        super(nome, vida); // Chama o construtor do Personagem.
        this.armadura = armadura; // Define o que é explusivo do Guerreiro
    }

    @Override
    public void emitirSomDeBatalha(){
        System.out.println("O guerreiro está se preparando para a batalha!");
    }

    @Override
    public void receberDano(int dano){
        int danoComDesconto = dano - this.armadura;
        if(danoComDesconto > 0) {
            super.receberDano(danoComDesconto);
        }
    }

    public void setArmadura(int armaduraNova) {
        if (armaduraNova < 0) {
            System.out.println("Armadura não pode ser negativa!");
        } else if (armaduraNova > 100) {
            this.armadura = 100; // Limita ao máximo permitido
        } else {
            this.armadura = armaduraNova; // Valor totalmente válido
        }
    }

    public int getArmadura(){
        return armadura;
    }
}
