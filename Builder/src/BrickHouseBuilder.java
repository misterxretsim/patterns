public class BrickHouseBuilder implements HouseBuilder{

    private BrickHouse result;

    @Override
    public void reset() {
        result = new BrickHouse();
    }

    @Override
    public void buildMaterial() {
        result.setMaterial("brick");
    }

    @Override
    public void buildWalls() {
        result.setWalls(4);
    }

    @Override
    public void buildDoors() {
        result.setDoors(2);
    }

    @Override
    public void buildWindows() {
        result.setWindows(6);
    }

    @Override
    public void buildRoof() {
        result.setRoof(1);
    }

    public BrickHouse getResult() {
        return result;
    }
}
