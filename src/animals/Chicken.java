package animals;

import model.commodities.Egg;

public class Chicken extends DomesticatedAnimal {
    public static final int CHICKEN_PRICE = 100;
    public static final int CHICKEN_TURNS_NEEDED_TO_MAKE_EGG = 2;

    public Chicken() {
        super();
    }

    public Egg produce(){
        return new Egg(xCoordinate,yCoordinate);
    }
}
