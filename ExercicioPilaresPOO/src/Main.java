import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Revista r1 = new Revista("12345","Caras",20.0,5,"Abril","Variedades");
        Revista r2 = new Revista("54321","Capricho",20.0,5,"Abril","Fofoca");
        Jornal j1 = new Jornal("33333","Folha",10.0,10,20,01,2023);
        Jornal j2 = new Jornal("55555","JC",5.0,15,20,01,2023);


        Banca banca = new Banca(Arrays.asList(r1,r2,j1,j2));
        banca.venderProduto(r1);
        System.out.println(r1.getQntEstoque());
        banca.venderProduto(r1,3);
        System.out.println(r1.getQntEstoque());
        banca.venderProduto(r1,100);
        System.out.println(r1.getQntEstoque());
    }
}