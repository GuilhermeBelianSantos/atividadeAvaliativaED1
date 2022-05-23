public class NodePrincipal<Categoria> {
    private NodePrincipal ant;
    private Categoria info; // exemplo: “Filmes de ação”
    private NodePrincipal prox;
    // métodos da classe (gets, sets, construtor)

    public NodePrincipal(Categoria c) {
        this.info = c;
    }

    public void setAnt(NodePrincipal ant) {
        this.ant = ant;
    }

    public NodePrincipal getAnt() {
        return ant;
    }

    public void setProx(NodePrincipal prox) {
        this.prox = prox;
    }

    public NodePrincipal getProx() {
        return prox;
    }

    public void setInfo(Categoria c) {
        this.info = c;
    }

    public String getInfo() {
        return (String) this.info;
    }
}