package View;
import Model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        List<Product> dadosdanota = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Quantidade de Produtos da Nota");
        int qtd = sc.nextInt();

       for (int i = 0; i < qtd ; i++){
            System.out.println("Digite o nome do Produto");
            String nome = sc.next();
            System.out.println("Digite o Preço do Produto");
            double preco = sc.nextDouble();
            System.out.println("Digite a Quantidade do Produto");
            int quantidade = sc.nextInt();
            Product p = new Product(nome, preco, quantidade);
            dadosdanota.add(p);
        }

        for (Product p : dadosdanota){
            System.out.println(p);
        }




    }
}
