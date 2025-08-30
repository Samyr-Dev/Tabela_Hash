package model_hash;

public class Pessoa {
    private String nome;
    private String CPF;
    private int idade;



    public Pessoa() {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public int getIdade() {
        return idade;
    }


}
