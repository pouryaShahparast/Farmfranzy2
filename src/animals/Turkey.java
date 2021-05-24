package animals;

import model.commodities.Feather;

public class Turkey extends DomesticatedAnimal{
    public static final int TURKEY_PRICE = 200;
    public static final int TURKEY_TURNS_NEEDED_TO_MAKE_FEATHER = 3;

    public Turkey() {
        super();
    }

    public Feather produce(){
        return new Feather(xCoordinate,yCoordinate);
    }
}
