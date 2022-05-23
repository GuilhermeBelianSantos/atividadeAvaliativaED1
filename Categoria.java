public class Categoria implements Comparable<Categoria> {
    private String descricao; // nome da categoria
    private ListaFilmes lista; // referência para a lista de filmes daquela categoria
    // métodos da classe (gets, sets, construtor, compareTo, toString)
 
    public Categoria(String descricao){
        this.descricao = descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
 
    public String getDescricao() {
        return descricao;
    }
 
    public void setLista(ListaFilmes lista) {
        this.lista = lista;
    }
 
    public ListaFilmes getLista(){
        return lista;
    }
 
    @Override
    public int compareTo (Categoria c) {
        int retorno;
        retorno = this.descricao.compareTo(c.descricao);
        return retorno;        
    }
    @Override
    public String toString(){
        return "Descrição " + this.descricao;
    }
}
