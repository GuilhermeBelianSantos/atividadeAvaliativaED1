import java.util.Scanner;
public class aplicacao {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        ListaCategoria ListaCategoria = new ListaCategoria();
        ListaFilmes ListaFilmes = new ListaFilmes();
        int op, filme, categoria;
        do {
            exibirMenu();
            op = in.nextInt();
            switch (op) {
                case 1: System.out.println("Informe o nome da Categoria");
                        categoria = in.nextLine();
                        ListaCategoria.inserirOrdenado(categoria);
                        break;
                case 2: System.out.println("Informe o nome do Filme");
                        filme = in.nextLine();
                        ListaFilmes.inserirOrdenado(filme);
                        break;                        
                case 3: 
                        break;
                case 4: 
                        break;
                case 5: ListaCategoria.exibirLista();
                        break;
                case 6: ListaFilmes.exibirLista();
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
        System.out.println("5 - Exibir lista de Categorias");
        System.out.println("6 - Exibir lista de Filmes");
        System.out.print("Informe a opção desejada: ");
    }
}
