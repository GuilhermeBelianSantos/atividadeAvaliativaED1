public class ListaFilmes {
    private NodeSecundaria primeiro;
    private int qtd;
    private NodeSecundaria ultimo;
 
    // métodos da classe (inserção ordenada na lista, remoção na lista, busca na lista, exibição da lista)
    public boolean isEmpty() {
        if (this.primeiro == null && this.qtd == 0 && this.ultimo == null) {
            return true;
        } else {
            return false;
        }
    }
 
    public NodeSecundaria buscaMelhorada(Filme f) {
        NodeSecundaria aux;
        int retorno;
        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.primeiro;
            while (aux != null) {
                retorno = aux.getInfo().compareTo(f);
                if (retorno == 0) {
                    return aux;
                } else if (retorno > 0) {
                    return null;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }
 
    public void inserirOrdenado(Filme f) {
        NodeSecundaria novo = new NodeSecundaria(f);
        NodeSecundaria aux, anterior;
        int retorno;
        if (this.isEmpty() == true) { // inserção na lista vazia
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else if (f.compareTo(this.primeiro.getInfo()) < 0) { // inserção antes do primeiro
            novo.setProx(this.primeiro);
            this.primeiro.setAnt(novo);
            this.primeiro = novo;
            this.qtd++;
        } else if (f.compareTo(this.ultimo.getInfo()) > 0) { // inserção após o último
            this.ultimo.setProx(novo);
            novo.setAnt(this.ultimo);
            this.ultimo = novo;
            this.qtd++;
        } else { // inserção no meio - depois do primeiro e antes do último
            aux = this.primeiro;
            while (aux != null) {
                retorno = aux.getInfo().compareTo(f);
                if (retorno == 0) {
                    System.out.println("Valor repetido. Inserção não efetuada!");
                    return;
                } else if (retorno > 0) {
                    anterior = aux.getAnt();
                    novo.setAnt(anterior);
                    novo.setProx(aux);
                    anterior.setProx(novo);
                    aux.setAnt(novo);
                    this.qtd++;
                    System.out.println("Valor inserido com sucesso!!");
                    return;
                } else {
                    aux = aux.getProx();
                }
            }
        }
    }
 
    public void exibirLista() {
        Node aux;     
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia");
        }
        else {
            aux = this.primeiro;        
            do {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            } while (aux != this.primeiro);
        }
    } 
}