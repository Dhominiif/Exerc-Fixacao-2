public class Q4_E_Commerce {

    public static void main(String[] args){

        Q4_produto arroz = new Q4_produto("Arroz", 10, 5.50);

        System.out.println("\nNome do produto: "+arroz.getNome());
        System.out.println("Preco: "+arroz.getPreco());

        arroz.Comprar(1);

        System.out.println("Quantidade em estoque: "+arroz.getQuantidade());

        arroz.Comprar(1);

        System.out.println("Quantidade em estoque: "+arroz.getQuantidade());

        arroz.Comprar(9);

        System.out.println("Quantidade em estoque: "+arroz.getQuantidade());
    }
}
