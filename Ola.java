import java.util.Scanner;

public class Ola {
    public  static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Olá, Você!");
        System.out.println("Digite o seu nome: ");
        String nome = scan.nextLine();

        System.out.println("O seu nome é: " + nome);

    }
}