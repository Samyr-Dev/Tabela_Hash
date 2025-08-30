package model_hash;

public class Pessoa {
    private String nome;
    private String CPF;
    private int idade;


    public Pessoa(String nome, String CPF, int idade) {
        this.nome = nome;
        this.CPF = CPF;
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
        return " Nome: " + nome + ", CPF: " + CPF + ", Idade: " + idade;
    }


}
