import java.util.Scanner;
public class aplicacao {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        ListaCategoria ListaCategoria = new ListaCategoria();
        ListaFilmes ListaFilmes = new ListaFilmes();
        int op;
        Filme filme;
        String categoria;
        do {
            exibirMenu();
            op = in.nextInt();
            switch (op) {
                case 1: System.out.println("Informe o nome da Categoria");
                        categoria = in.next();
                        ListaCategoria.inserirOrdenado(categoria);
                        break;
                case 2: System.out.println("Informe o titulo do Filme");
                        String titulo = in.next();
                        System.out.println("Informe a categoria do Filme");
                        String genero = in.next();        
                        filme = new Filme(titulo, genero);
                        ListaFilmes.inserirOrdenado(filme);
                        break;                        
                case 3: System.out.println("Informe o nome da Categoria que deseja remover");
                        categoria = in.next();
                        ListaCategoria.remover(categoria);
                        break;
                case 4: System.out.println("Informe o nome do Filme que deseja remover");
                        titulo = in.next();
                        filme = new Filme(titulo);
                        ListaFilmes.remover(filme);
                        break;
                case 5: System.out.println("Informe o nome da Categoria que deseja buscar");
                        categoria = in.next();
                        ListaCategoria.buscaMelhorada(categoria);
                        break;        
                case 6: System.out.println("Informe o nome do Filme que deseja buscar");
                        titulo = in.next();        
                        filme = new Filme(titulo);
                        ListaFilmes.buscaMelhorada(filme);
                        break;
                case 7: ListaCategoria.exibirLista();
                        break;
                case 8: ListaFilmes.exibirLista();
                        break;

                case 0: break;
                default: System.out.println("Opção inválida");
            }            
        } while (op != 0);
    }
    
    public static void exibirMenu() {
        System.out.println("Opções");
        System.out.println("1 - Inserir uma Categoria");
        System.out.println("2 - Inserir um Filme");
        System.out.println("3 - Remover uma Categoria");        
        System.out.println("4 - Remover um Filme");
        System.out.println("5 - Buscar uma Categoria");
        System.out.println("6 - Buscar um Filme");
        System.out.println("7 - Exibir lista de Categorias");
        System.out.println("8 - Exibir lista de Filmes");
        System.out.print("Informe a opção desejada: ");
    }
}
