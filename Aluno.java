public class Aluno extends Pessoa
{
    private int numeroMatricula = 0;
    
    public Aluno(String nome, int idade, String curso) {
        super(nome, idade, curso);
    }
    
    public String apresenta() {
        return super.apresenta() + "\nMatrícula: " + numeroMatricula;
    }
    
    public int getNumeroMatricula() {
        return this.numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
}
