public class Revista extends Produto{
    private String editora;
    private String tipo;

    public Revista(String código, String nome, double preço, int qntEstoque, String editora, String tipo) {
        super(código, nome, preço, qntEstoque);
        this.editora = editora;
        this.tipo = tipo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
