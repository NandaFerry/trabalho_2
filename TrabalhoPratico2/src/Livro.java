public class Livro {

    private long codigo;
    private String titulo;
    private String descricao;
    private String autor;
    private String editora;

    public Livro (long codigo){
        this.codigo = codigo;
        this.titulo = "titulo " + codigo;
        this.descricao = "descricao" + codigo;
        this.autor = "autor "+ codigo;
        this.editora = "editora" + codigo;
    }

    public long getCodigo() {
        return codigo;
    }

}
