package Model;

public class Product {
    String name;
    Double price;
    int quantity;
    int qtd;

    public Product(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.qtd = 0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "\nname= '" + name + '\'' +
                ", \nprice= " + price +
                ", \nquantity= " + quantity +
                ", \nqtd= " + qtd +
                '}';
    }
}

