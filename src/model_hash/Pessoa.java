package model_hash;

public class Pessoa {
    private String CPF;
    private String nome;
    private int idade;


    public Pessoa(String CPF, String nome, int idade) {
        this.CPF = CPF;
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString(){
        return " CPF: " + CPF + ", nome: " + nome + ", Idade: " + idade;
    }


}
