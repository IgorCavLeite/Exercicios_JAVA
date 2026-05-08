package Exercicio_15;

class Personagem {
    String nome;
    private int vida;
    int forca;
    static int totalPersonagens;

    public Personagem(String nomeInicial, int vidaInicial){
        this.nome=nomeInicial;
        this.vida=vidaInicial;
        totalPersonagens++;
    }

    void mostrar(){
        System.out.println("Nome: " + nome + " | Vida: " + vida);
    }

    public void receberDano(int dano){
        if (dano > 0){
            this.vida -= dano;
            if(this.vida < 0) {
                this.vida = 0;
            }
        }
    }

    public void receberCura(int cura){
        if (cura > 0){
            this.vida += cura;
            if(this.vida > 100) {
                this.vida = 100;
            }
        }
    }

    public void emitirSomDeBatalha(){
        System.out.println("O personagem está se preparando para a batalha!");
    }

    void atacar(){
        System.out.println("O personagem realiza um ataque básico!");
    }

    public int getVida() {
        return this.vida;
    }

    public void setNome(String novoNome){
        if(!novoNome.isEmpty()){
            this.nome = novoNome;
        } else {
            System.out.println("O nome inválido!");
        }
    }
}
