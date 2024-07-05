package model;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "O nome da pessoa é: " + this.nome;
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        return this.nome.compareTo(outraPessoa.getNome());
    }

}
