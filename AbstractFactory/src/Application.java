import ImplModels.ModernFurnitureFactory;

public class Application {
    public static void main(String[] args) {
        Client me = new Client(new ModernFurnitureFactory());
        me.getProducts();
    }
}