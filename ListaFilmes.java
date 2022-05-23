public class ListaFilmes {
    private NodeSecundaria primeiro;
    private int qtd;
    private NodeSecundaria ultimo;

    // métodos da classe (inserção ordenada na lista, remoção na lista, busca na
    // lista, exibição da lista)
    public boolean isEmpty() {
        if (this.primeiro == null && this.qtd == 0 && this.ultimo == null) {
            return true;
        } else {
            return false;
        }
    }

    public Filme buscaMelhorada(Filme f) {
        NodeSecundaria aux;
        int retorno;
        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.primeiro;
            while (aux != null) {
                retorno = aux.getInfo().compareTo(f);
                if (retorno == 0) {
                    return aux.getInfo();
                } else if (retorno > 0) {
                    return null;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }

    public void inserirOrdenado(Filme filme) {
        NodeSecundaria novo = new NodeSecundaria(filme);
        NodeSecundaria aux, anterior;
        int retorno;
        if (this.isEmpty() == true) { // inserção na lista vazia
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else if (filme.compareTo(this.primeiro.getInfo()) < 0) { // inserção antes do primeiro
            novo.setProx(this.primeiro);
            this.primeiro.setAnt(novo);
            this.primeiro = novo;
            this.qtd++;
        } else if (filme.compareTo(this.ultimo.getInfo()) > 0) { // inserção após o último
            this.ultimo.setProx(novo);
            novo.setAnt(this.ultimo);
            this.ultimo = novo;
            this.qtd++;
        } else { // inserção no meio - depois do primeiro e antes do último
            aux = this.primeiro;
            while (aux != null) {
                retorno = aux.getInfo().compareTo(filme);
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
    public void remover (Filme filme) {
        NodeSecundaria anterior, atual;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia");
        }
        else if (this.qtd == 1){
            if (this.primeiro.getInfo().compareTo(filme) == 0) {
                this.primeiro = null;
                this.ultimo = null;
                this.qtd = 0;
            }
            else {
                System.out.println("Categoria não encontrada");
            }            
        }
        else if (this.primeiro.getInfo().compareTo(filme) == 0) {
            this.primeiro = this.primeiro.getProx();
            this.qtd--;
            this.ultimo.setProx(this.primeiro);
            this.primeiro.setAnt(this.ultimo);            
        }
        else if (this.ultimo.getInfo().compareTo(filme) == 0) {
            anterior = this.primeiro;
            while (anterior.getProx() != this.ultimo) {
                anterior = anterior.getProx();
            }
            this.ultimo = anterior;
            this.qtd--;
            this.ultimo.setProx (this.primeiro);
            this.primeiro.setAnt(this.ultimo);
        }
        else if (filme.compareTo(this.primeiro.getInfo()) < 0) {
            System.out.println("Livro não cadastrado");
        }
        else if (filme.compareTo(this.ultimo.getInfo()) > 0) {
            System.out.println("Livro não cadastrado");
        }
        else {
            anterior = this.primeiro;
            atual = anterior.getProx();
            do {
                int retorno = atual.getInfo().compareTo(filme);
                if (retorno == 0) { // achou!!
                    anterior.setProx(atual.getProx());
                    this.qtd--;
                    System.out.println("remoção efetuada");
                    return;
                }
                else if (retorno > 0) {
                    System.out.println("Livro não cadastrado");
                    return;
                }
                else {
                    anterior = anterior.getProx();
                    atual = atual.getProx();
                }
            } while (atual != this.primeiro);            
        }
    }

    public void exibirLista() {
        NodeSecundaria aux;
        if (this.isEmpty() == true) {
            System.out.println("Não existem Filmes cadastrados!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }


    public int compareTo(String info) {
        return 0;
    }
}