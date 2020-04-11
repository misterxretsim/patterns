package ImplModels;

import ImplModels.VictorianChair;
import ImplModels.VictorianCoffeeTable;
import Models.AbstractFurnitureFactory;
import Models.Chair;
import Models.CoffeeTable;
import Models.Sofa;

public class VictorianFurnitureFactory implements AbstractFurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}