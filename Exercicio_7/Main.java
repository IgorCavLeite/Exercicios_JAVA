import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Descreva o relato: ");
        String depoimento = scan.nextLine();

        Relato r = new Relato();
        r.textoOcorrencia = depoimento; 

        Relato.Investigador i = r.new Investigador();
        i.exibirResumo();

        scan.close();

    }
}