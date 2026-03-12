package Exercicio_6;

public class Seguranca {

    public class Mascarador {
        
        public String MascararEmail(String email){
            int posicaoArroba = email.indexOf("@");
            String comeco = email.substring(0, 2);
            String dominio = email.substring(posicaoArroba);
            return comeco + "***" + dominio;
        }

        public String MascararCpf(String cpf){
            String inicio = cpf.substring(0, 3);
            String fim = cpf.substring(9);
            return inicio + ".***.***-" + fim;
        }
    }
}
