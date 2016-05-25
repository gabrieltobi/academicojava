public class Pessoa
{
    private String curso = "";
    private String endereco = "";
    private int idade = 0;
    private String nome = "";

    public Pessoa(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }
    
    public String apresenta() {
        return "\nNome: " + nome + "\nIdade: " + idade + "\nCurso: " + curso + "\nEndereço: " + endereco;
    }

    public String getCurso() {
        return this.curso;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
