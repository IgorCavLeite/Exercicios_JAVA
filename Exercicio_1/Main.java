package Exercicio_1;
/*
Exercício 1: O Validador de Senha (Lógica e Repetição)
Objetivo: Praticar while, if/else e static final.

Crie uma classe Seguranca.

Defina uma constante public static final int SENHA_MESTRA = 2026;.

No main, peça para o usuário digitar a senha.

Enquanto a senha for errada, diga "Acesso Negado" e conte quantas tentativas ele já fez.

Quando acertar, diga: "Acesso Permitido! Tentativas: X".
*/

import java.util.Scanner;

public class Main {

    public static final int senhaMestra = 2026;
    public static void main (String[] args) {

        int tentativas = 0;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        int senha = scan.nextInt();
        scan.nextLine();

        while (senha != senhaMestra) {
            tentativas++; // soma 1 erro

            System.out.println("Acesso negado! Tete novamente.");

            System.out.println("Digite a senha novamente: ");
            senha = scan.nextInt();
            scan.nextLine();
        }

        System.out.println("Acesso permitido! Você precisou de " + (tentativas + 1) + " tentativa(s).");

        scan.close();
    }
}

