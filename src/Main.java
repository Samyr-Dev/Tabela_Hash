import model_hash.HashTable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashTable tabela = new HashTable(10);

        while (true){
            System.out.println("\n--- MENU ---");
            System.out.println("1- Cadastrar Pessoa");
            System.out.println("2- Buscar Cadastro por CPF");
            System.out.println("3- Mostrar todos os cadastros realizados");
            System.out.println("4- Sair");
            System.out.println("Opção: ");
            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1){
                System.out.println("Digite o CPF: ");
                String CPF = sc.nextLine();
            }
        }

    }
}