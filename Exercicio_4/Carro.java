package Exercicio_4;

public class Carro{
    private String modelo;

    public Carro(String modelo){
        this.modelo = modelo;
    }

    // Essa "public class Motor " é uma classe inner, isso quer dizer que é uma classe interna. As classes internas são útil para o agrupamento lógico. Pois quando uma classe é útil para apenas uma outra, não faz sentido deixar ela solta no código.
    public class Motor{

        public void diagnostico(){
            System.out.println("Efetuando leitura de motor...Status: OK! Este motor pertence ao modelo: " + modelo);
        }

    }

    // Essa é uma class interna static. Ela não tem acesso aos atributos da class carro.
    public static class Pneu{
        private int pressao;

        public Pneu(int pressao){
            this.pressao = pressao;
        }

        public int verificar(){
            
            System.out.println("Pressão do pneu: " + pressao + " PSI. Calibragem recomendada: 32 PSI");
            return pressao;
        }
    }
}
