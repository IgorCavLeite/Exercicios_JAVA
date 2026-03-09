/*
📚 Exercício 2: Gestão de Biblioteca (POO)
O Cenário: Você foi contratado para criar o sistema interno de um leitor de e-books. 
O sistema precisa controlar o progresso de leitura de cada livro.

O Roteiro:
Crie a classe Livro: Atributos Privados: titulo (String), autor (String), paginasTotais (int) e paginasLidas (int). 

O Construtor:Deve receber o titulo, o autor e o paginasTotais.O atributo paginasLidas deve sempre começar em 0 (ninguém começa um livro lido, certo?).

Encapsulamento:Crie apenas os Getters para todos os atributos.Não crie Setters manuais para paginasLidas. O controle da leitura deve ser feito por um método específico.

Os Métodos de Lógica:exibirProgresso(): Deve calcular e imprimir a porcentagem lida do livro.Fórmula: $percentual = \frac{paginasLidas \times 100}{paginasTotais}$lerPaginas(int quantidade): Este método soma a quantidade de páginas lidas ao valor atual.
Regra de Ouro: Você não pode deixar o usuário ler mais páginas do que o livro tem. Se o total lido ultrapassar o total do livro, force o valor para ser igual ao total de páginas.
*/

package Exercicio_3;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
    Livro l1 = new Livro("Harry Potter", "J.K Rolling", 250);
    Scanner scan = new Scanner(System.in);

    System.out.println("Quantas páginas você leu hoje?");
    int quantidade = scan.nextInt();

    l1.lerPaginas(quantidade);
    System.out.println("Seu progresso atual é: " + l1.exibirProgresso() + "%");
    
    scan.close();
    
    }

    
}
