import Models.AbstractFurnitureFactory;
import Models.Chair;
import Models.CoffeeTable;
import Models.Sofa;

public class Client {

    private AbstractFurnitureFactory factory;

    public Client(AbstractFurnitureFactory factory) {
        this.factory = factory;
    }

    public void getProducts(){
        Chair myChair = factory.createChair();
        CoffeeTable myCoffeeTable = factory.createCoffeeTable();
        Sofa mySofa = factory.createSofa();
    }
}