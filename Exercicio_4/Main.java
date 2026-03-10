/*
O Cenário: Você está desenvolvendo o software de bordo de uma montadora. O sistema precisa gerenciar componentes que são "parte do corpo" do carro e componentes que são "peças universais".

1. A Classe "Mãe" (Outer Class): Carro
Atributo Privado: String modelo (ex: "Mustang GTR").

Construtor: Inicializa o modelo.

Método: exibirInfo() que imprime o modelo do carro.

2. A "Parte Integrante" (Inner Class): Motor
Teoria: O motor é o coração do carro. Ele não existe funcionalmente sem estar dentro de um chassi específico.

O que fazer: Crie a classe Motor dentro de Carro (sem a palavra static).

Método diagnostico(): Deve imprimir: "Efetuando leitura do motor... Status: OK. Este motor pertence ao modelo: [modelo]".

Desafio: Acesse o atributo modelo da classe Carro diretamente.

3. A "Peça Independente" (Static Nested Class): Pneu
Teoria: Um pneu é uma peça fabricada separadamente. Ele pode estar em um Mustang, em um trator ou na prateleira de uma loja. Ele não precisa saber em qual carro está para medir sua própria pressão.

O que fazer: Crie a classe Pneu dentro de Carro, mas usando a palavra static.

Atributo Privado: int pressao (PSI).

Construtor: Inicializa a pressão.

Método verificar(): Imprime: "Pressão do pneu: [pressao] PSI. Calibragem recomendada: 32 PSI."

Atenção: Tente acessar o modelo do carro aqui dentro. Você verá que o Java dará erro! (Isso prova que a classe estática é independente).

🛠️ O Teste na Classe Main
O seu objetivo na Main é provar que você domina as duas sintaxes de criação:

Criação do Carro: Instancie um carro chamado meuCarro.

Criação do Motor (Sintaxe de Objeto): Use o meuCarro para dar vida ao Motor.

Criação do Pneu (Sintaxe de Classe): Crie um objeto Pneu diretamente pela classe Carro, sem precisar de um carro instanciado.
*/
package Exercicio_4;

public class Main{
    public static void main(String[] args){
        Carro MyCar = new Carro("Mustang GTR");
        Carro.Motor m = MyCar.new Motor();
        Carro.Pneu p = new Carro.Pneu(30);

        m.diagnostico();
        p.verificar();
    }
}