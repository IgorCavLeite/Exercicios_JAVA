package Exercicio_14;

public class Inversao {
    static String inverter(String texto){
        if(texto.isEmpty() || texto.length() == 1){
            return texto;
        }
        
        char ultimaLetra = texto.charAt(texto.length() - 1);
        String restoDoTexto = texto.substring(0, texto.length() - 1);
        return ultimaLetra + inverter(restoDoTexto);
    }
}
