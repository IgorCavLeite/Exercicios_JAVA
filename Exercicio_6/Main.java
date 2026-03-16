package Exercicio_6;

import Exercicio_6.Seguranca.Mascarador;

/*
O Cenário: Você está trabalhando no sistema de um banco. Para cumprir as leis de proteção de dados (como a LGPD), o sistema não pode exibir o e-mail ou o CPF completo dos clientes em telas de consulta simples.

1. A Estrutura
Crie uma classe chamada Seguranca. Dentro dela, teremos uma Inner Class chamada Mascarador.

2. O Desafio (Sua Missão)
Implemente dois métodos na classe Mascarador:

mascararEmail(String email):

O e-mail deve ser exibido apenas com as duas primeiras letras e o domínio.

Exemplo: contato@email.com vira co*****@email.com.

Dica: Use .indexOf("@") para achar a posição do símbolo e .substring(0, 2) para pegar o início.

mascararCPF(String cpf):

O CPF deve mostrar apenas os 3 primeiros dígitos e os 2 últimos (os dígitos verificadores).

Exemplo: 12345678900 vira 123.***.***-00.

Dica: Use o .substring() com diferentes pontos de corte.
*/

import java.util.Scanner;
public class Main {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o Email: ");
        String email = scan.nextLine();

        System.out.println("Digite o CPF: ");
        String cpf = scan.nextLine();

        Seguranca seguranca = new Seguranca();
        Seguranca.Mascarador m = seguranca.new Mascarador();

        System.out.println("\n--- DADOS PROTEGIDOS ---");
        System.out.println("E-mail: " + m.MascararEmail(email));
        System.out.println("CPF: " + m.MascararCpf(cpf));

        scan.close();
    }
}
