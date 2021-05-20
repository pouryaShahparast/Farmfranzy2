import model.commodities.Milk;

public class Buffalo extends model.animals.DomesticatedAnimal {
    public static final int BUFFALO_PRICE = 400;
    public static final int BUFFALO_TURNS_NEEDED_TO_MAKE_MILK = 2;

    public Buffalo() {
        super();
    }

    public Milk produce(){
        return new  Milk(xCoordinate , yCoordinate);
    }
}
