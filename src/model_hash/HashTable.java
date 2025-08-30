package model_hash;


public class HashTable {


    private Pessoa[] tabela;
    private int tamanho;

    public HashTable(int tamanho) {
        this.tamanho = tamanho;
        tabela = new Pessoa[tamanho];
    }

    private int hash(String CPF) {
        return Math.abs(CPF.hashCode() % tamanho);
    }

    public void inserir(Pessoa p) {
        int pos = hash(p.getCPF());

        while (tabela[pos] != null) {
            if (tabela[pos].getCPF().equals(p.getCPF())) {
                System.out.println("Erro: CPF já cadastrado!");
                return;
            }
            pos = (pos + 1) % tamanho;
        }
        tabela[pos] = p;

    }

    public Pessoa buscar(String CPF) {
        int pos = hash(CPF);

        while (tabela[pos] != null) {
            if (tabela[pos].getCPF().equals(CPF)) {
                return tabela[pos];
            }
            pos = (pos + 1) % tamanho;
        }
        return null;
    }

    public void mostrar() {
        for (Pessoa p : tabela) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }
}
