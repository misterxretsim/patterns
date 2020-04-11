public class Client {

    public static void main(String[] args) {
        BrickHouseBuilder brickHouseBuilder = new BrickHouseBuilder();
        Director director = new Director(brickHouseBuilder);
        director.makeHouse();
        BrickHouse house = brickHouseBuilder.getResult();
    }

}
