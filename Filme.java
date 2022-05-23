public class Filme implements Comparable<Filme> {
    private String titulo; // exemplo: “O Rei Leão”
    private String genero; // exemplo: “Musical infantil”
    private String classificacao; // exemplo: “Livre”
    private int ano; // exemplo: 1994
    // métodos da classe (gets, sets, construtor, compareTo, toString)

    public Filme(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public Filme(String titulo) {
        this.titulo = titulo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setClassigicacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public int compareTo(Filme f) {
        int retorno;
        retorno = this.titulo.compareTo(f.titulo);
        return retorno;
    }

    @Override
    public String toString() {
        return "Titulo " + this.titulo + ", genero " + this.genero + ", Classificação " + this.classificacao + ", ano "
                + this.ano;
    }

}