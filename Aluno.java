public class Aluno extends Pessoa
{
    private int numeroMatricula = 0;
    
    public Aluno(String nome, int idade, String curso) {
        super(nome, idade, curso);
    }
    
    public int getNumeroMatricula() {
        return this.numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
}
