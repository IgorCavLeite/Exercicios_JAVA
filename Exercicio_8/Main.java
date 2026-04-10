/*
Exercício: O Inventário de Evidências (Básico)
Crie um programa que gerencie os itens encontrados em uma cena de crime.

Declare um Array de Strings chamado evidencias com capacidade para 4 itens.

Adicione manualmente 4 itens (ex: "Celular", "Faca", "Documento", "Chave").

Imprima no console apenas a segunda e a última evidência da lista.
*/
public class Main {
    public static void main(String[] args){
        String[] evidencias = new String[4];
        evidencias[0] = "Celular";
        evidencias[1] = "Faca";
        evidencias[2] = "Documento";
        evidencias[3] = "Chave";
        System.out.println(evidencias[1]);
        System.out.println(evidencias[3]);
    }
}