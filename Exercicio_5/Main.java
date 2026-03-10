package Exercicio_5;
/*
O Cenário: Você está desenvolvendo um módulo para uma ferramenta de inteligência de dados. O objetivo é receber um texto "sujo" (com espaços extras, misturando maiúsculas e minúsculas) e normalizá-lo para que o sistema consiga processar as informações corretamente.

1. A Entrada
Peça para o usuário digitar uma frase que represente uma "Ocorrência", por exemplo:

"  O suspeito fugiu em um carro prata   "

2. Requisitos de Processamento (Sua Missão):
Crie a classe Analista e, no método main, implemente as seguintes saídas:

Normalização Total: Imprima a frase sem espaços inúteis no início e no fim (use .trim()) e totalmente em MAIÚSCULAS.

Métrica de Tamanho: Exiba quantos caracteres a frase possui (incluindo espaços).

Dica: Use .length().

Hifenização (Slug): Transforme a frase em um formato de "link" ou "ID", substituindo todos os espaços por sublinhados (_).

Dica: Use .replace(" ", "_").

Extração de Palavra-Chave: Isole e imprima apenas a primeira palavra da frase.

Desafio: Tente usar o .split(" ") que transforma a frase em um array de palavras, e pegue a posição [0].

Verificação de Conteúdo: Verifique se a frase contém a palavra "carro" e imprima um booleano (true ou false).

Dica: Use o método .contains("carro").
*/
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a descrição da ocorrência.");
        String fraseOriginal = scan.nextLine();

        Main.Analista analista = new Main().new Analista();

        String normalizada = analista.Normalizacao(fraseOriginal);
        int totalCaracteres = analista.contarCaracteres(fraseOriginal);   
        String primeira = analista.extrairPrimeiraPalavra(fraseOriginal);
        String substituir = analista.substituirEspacos(fraseOriginal);

        System.out.println("Texto normalizado: " + normalizada);
        System.out.println("Subistituir espaços" + substituir);
        System.out.println("Total de caracteres: " + totalCaracteres);
        System.out.println("Primeira letra: " + primeira);
        scan.close();;
    }

    public class Analista {

        public String Normalizacao(String fraseOriginal){
            String resultado = fraseOriginal.trim().toUpperCase();

            return resultado;
        }

        public String substituirEspacos(String fraseOriginal){
            String resultado = fraseOriginal.replace(" ", "_");
            
            return resultado;
        }

        public int contarCaracteres(String fraseOriginal){
            int quantidade = fraseOriginal.length();

            return quantidade;
        }

        public String extrairPrimeiraPalavra(String fraseOriginal){
            String textoLimpo = fraseOriginal.trim();

            String[] palavras = textoLimpo.split(" ");

            return palavras[0];
        }
    }
}
