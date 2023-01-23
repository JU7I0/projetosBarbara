import java.time.LocalDate;

public class Jornal extends Produto{
    private LocalDate data;

    public Jornal(String código, String nome, double preço, int qntEstoque, int dia,int mes,int ano) {
        super(código, nome, preço, qntEstoque);
        this.data = LocalDate.of(ano,mes,dia);
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
