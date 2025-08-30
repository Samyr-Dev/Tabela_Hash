package model_hash;

public class Pessoa implements ValidarCPF {
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
    public Boolean validadorCPF(){
        if (CPF != null && CPF.length() == 11){
            return true;
        }
        else {
            System.out.println("CPF inválido. Verifique a quantidade de dígitos.");
            return false;
        }

    }

    @Override
    public String toString(){
        return " CPF: " + CPF + ", Nome: " + nome + ", Idade: " + idade;
    }




}
