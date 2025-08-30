import model_hash.HashTable;
import model_hash.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashTable tabela = new HashTable(10);

        while (true) {
            System.out.println("--- MENU ---");
            System.out.println("1- Cadastrar Pessoa");
            System.out.println("2- Buscar Cadastro por CPF");
            System.out.println("3- Mostrar todos os cadastros realizados");
            System.out.println("4- Sair");
            System.out.println("Opção: ");

            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.println("Digite o CPF: ");
                String CPF = sc.nextLine();
                System.out.println("Digite o nome: ");
                String nome = sc.nextLine();
                System.out.println("Digite a Idade: ");
                int idade = sc.nextInt();

                Pessoa p = new Pessoa(CPF, nome, idade);
                tabela.inserir(p);

            } else if (op == 2) {
                System.out.println("Digite o CPF: ");
                String CPF = sc.nextLine();
                Pessoa p = tabela.buscar(CPF);
                if (p != null) {
                    System.out.println("Encontrado: " + p);

                } else {
                    System.out.println("Cadastrado não encontrado!");
                }
            } else if (op == 3) {
                tabela.mostrar();
            } else if (op == 4) {
                System.out.println("Encerrando a execução...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}