public class PessoaAssalariada extends Pessoa
{
    private double salario = 0.0;
    
    public PessoaAssalariada(String nome, int idade, String curso) {
        super(nome, idade, curso);
    }
    
    public String apresenta() {
        return super.apresenta() + "\nSalário: " + salario;
    }
    
    public double getSalario() {
        return this.salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
