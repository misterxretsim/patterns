package ImplModels;

import ImplModels.ModernChair;
import ImplModels.ModernCoffeeTable;
import Models.AbstractFurnitureFactory;
import Models.Chair;
import Models.CoffeeTable;
import Models.Sofa;

public class ModernFurnitureFactory implements AbstractFurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}