public class Director {

    private HouseBuilder builder;

    public Director(HouseBuilder builder) {
        this.builder = builder;
    }

    public void makeHouse(){
        builder.reset();
        builder.buildMaterial();
        builder.buildWalls();
        builder.buildRoof();
        builder.buildDoors();
        builder.buildWindows();
    }
}
