public class Nodo
{
    private Nodo proximo = null;
    private Pessoa info = null;
    
    public Nodo getProximo() {
        return proximo;
    }
    
    public Pessoa getInfo() {
        return info;
    }
    
    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
    
    public void setInfo(Pessoa conta) {
        this.info = conta;
    }    
}
