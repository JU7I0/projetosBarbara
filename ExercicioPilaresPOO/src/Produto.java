public abstract class Produto {
    private String código;
    private String nome;
    private double preço;
    private int qntEstoque;

    public Produto() {
    }

    public Produto(String código, String nome, double preço, int qntEstoque) {
        this.código = código;
        this.nome = nome;
        this.preço = preço;
        this.qntEstoque = qntEstoque;
    }

    public String getCódigo() {
        return código;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getQntEstoque() {
        return qntEstoque;
    }

    public void esvaziarEstoque(int qnt) {
        if(qnt<=this.qntEstoque)
        this.qntEstoque -= qnt;
        else System.out.println("Estoque insuficiente!");
    }

    public void aumentarEstoque(int qnt) {
            this.qntEstoque += qnt;
    }
}
