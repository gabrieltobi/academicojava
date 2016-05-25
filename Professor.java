public class Professor extends PessoaAssalariada
{
    private boolean afastamentoMedico = false;

    public Professor(String nome, int idade, String curso) {
        super(nome, idade, curso);
    }
    
    public String apresenta() {
        String afastado = afastamentoMedico ? "Sim" : "Não";
        return super.apresenta() + "\nAfastado: " + afastado;
    }
    
    public boolean getAfastamentoMedico() {
        return this.afastamentoMedico;
    }

    public void setAfastamentoMedico(boolean afastamentoMedico) {
        this.afastamentoMedico = afastamentoMedico;
    }
}
