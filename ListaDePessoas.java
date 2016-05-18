public class ListaDePessoas 
{
    private Nodo primeiro = null;    
    private int quantidade = 0;

    public Pessoa get(int posicao) {
        if (posicaoLivre(posicao)) {
            Nodo n = this.primeiro;
            for (int i = 0; i < posicao; i++) {
                n = n.getProximo();
            }
            return n.getInfo();    
        } else {
            return null;
        }
    }

    public RetornoPadrao incluirPessoa(Pessoa pessoa)
    {
        Nodo nodo = new Nodo();
        nodo.setInfo(pessoa);        
        Nodo aux = this.primeiro;
        if (quantidade > 0) {
            while(aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(nodo);
        }else {
            this.primeiro = nodo;
        }
        quantidade++;
        return new RetornoPadrao("Pessoa incluída", false);
    }

    public ListaDePessoas pessoasDoCurso(String nomeDoCurso) {
        ListaDePessoas ldp = new ListaDePessoas();
        Nodo n = this.primeiro;
        for (int i = 0; i < quantidade; i++) {            
            if ((n.getInfo().getCurso()).equals(nomeDoCurso)) {
                ldp.incluirPessoa(n.getInfo());
            }
            n = n.getProximo();
        }
        return ldp;
    }   

    public boolean posicaoLivre(int posicao) {
        if (posicao < quantidade && posicao >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public Pessoa procura(String nome) {
        Nodo n = this.primeiro;
        if (n == null) {
            return null;
        }
        Pessoa p = n.getInfo();
        int i = 0;

        while(!p.getNome().equals(nome) && i < quantidade) {
            n = n.getProximo();
            p = n.getInfo();
            i++;
        }

        return i == quantidade ? null : p;
    }

    public int quantidade() {
        return quantidade;
    }    
}