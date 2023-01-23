import java.util.List;

public final class Banca {
    private List<Produto> listaDeProdutos;

    public Banca() {
    }

    public Banca(List<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }

    //Sobrecarga
    //Assinatura: venderProduto(Produto)
    public void venderProduto(Produto p){
        if(this.listaDeProdutos.contains(p)){
            int indice = this.listaDeProdutos.indexOf(p);
            this.listaDeProdutos.get(indice).esvaziarEstoque(1);
            System.out.println("Produto vendido com sucesso!");
        }
        else System.out.println("Produto não está na lista!");
    }

    //Sobrecarga
    //Assinatura: venderProduto(Produto,qnt)
    public void venderProduto(Produto p, int qnt){
        if(this.listaDeProdutos.contains(p)){
            int indice = this.listaDeProdutos.indexOf(p);
            this.listaDeProdutos.get(indice).esvaziarEstoque(qnt);
            System.out.println("Produto vendido com sucesso!");
        }
        else System.out.println("Produto não está na lista!");
    }


    public List<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void adicionarProduto(Produto prod){
        this.listaDeProdutos.add(prod);
    }

    public void limparEstoque(){
        this.listaDeProdutos.clear();
    }
}
