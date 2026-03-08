/*
    Exercício 2: Peça 3 notas de um aluno e faça o cálculo da média.
    Se a média for maior ou igual que 7$, exiba "Aprovado".
    Se a média for entre 5 e 6.9, exiba "Recuperação".
    Se for menor que 5, "Reprovado".
*/

package Exercicio_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite as notas: ");
        float n1 = scan.nextFloat();
        float n2 = scan.nextFloat();
        float n3 = scan.nextFloat();

        float media = (n1 + n2 + n3) / 3;

        if (media >= 7) {
            System.out.println("Parabéns! Você foi aprovado.");
        } else if (media >= 5 && media < 7 ) {
            System.out.println("Você está de recuperação!");
        } else {
            System.out.println("Você foi reprovado!");
        }



    }
}
