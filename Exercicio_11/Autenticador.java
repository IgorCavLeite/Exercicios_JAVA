package Exercicio_11;

// Prática para treinar Sobrecarga de método(Method Overloading)

public class Autenticador{
    static void login(String senha){
        if(senha.equals("1234")){
            System.out.println("Acesso biométrico solicitado");
        }
    }

    static void login(String usuario, String senha){
        if(usuario.equals("admin") && senha.equals("admin123")){
            System.out.println("Acesso administrativo concedido.");
        }
    }
}