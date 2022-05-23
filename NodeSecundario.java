public class NodeSecundaria {
    private NodeSecundaria ant;
    private Filme info;
    private NodeSecundaria prox;
    // métodos da classe (gets, sets, construtor)
 
    public NodeSecundaria(Filme f){
        this.info = f;
    }
    public void setAnt(NodeSecundaria ant){
        this.ant = ant;
    }
    public NodeSecundaria getAnt(){
        return ant;
    }
    public void setProx(NodeSecundaria prox){
        this.prox = prox;
    }
    public NodeSecundaria getProx(){
        return prox;
    }
    public void setInfo(Filme f){
        this.info = f;
    }
    public Filme getInfo(){
        return info;
    }
}
