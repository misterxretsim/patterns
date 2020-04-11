public class WoodenHouseBuilder implements HouseBuilder{

    private WoodenHouse result;

    @Override
    public void reset() {
        result = new WoodenHouse();
    }

    @Override
    public void buildMaterial() {
        result.setMaterial("wood");
    }

    @Override
    public void buildWalls() {
        result.setWalls(4);
    }

    @Override
    public void buildDoors() {
        result.setDoors(1);
    }

    @Override
    public void buildWindows() {
        result.setWindows(5);
    }

    @Override
    public void buildRoof() {
        result.setRoof(1);
    }

    public WoodenHouse getResult(){
        return result;
    }
}
