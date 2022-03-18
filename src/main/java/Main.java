import Service.ProductService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Printing the Products");
        ProductService pc = new ProductService();
    pc.getAllProducts().forEach(System.out::println);
    }
}
