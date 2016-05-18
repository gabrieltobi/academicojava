public class Funcionario extends PessoaAssalariada
{
    private double cargaHoraria = 0.0;

    public Funcionario(String nome, int idade, String curso) {
        super(nome, idade, curso);
    }
    
    public double getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
