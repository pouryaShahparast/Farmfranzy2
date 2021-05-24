package factories;

import model.Coin;
import model.commodities.Bread;
import model.commodities.Flour;

public class Bakery extends SecondaryFactory{
    public static final int BAKERY_CONSTRUCTION_PRICE = 250;
    public static final int TIME_NEEDED_TO_MAKE_BREAD_WITHOUT_UPGRADE = 5;
    public static final int TIME_NEEDED_TO_MAKE_BREAD_WITH_UPGRADE = 3;
    private Bread makeUpgraded(Flour flour){
        //TODO
        return null;
    }
    private Bread makeUpgraded(Flour flour1 , Flour flour2){
        //TODO
        return null;
    }
    private Bread makeNotUpgraded(Flour flour){
        //TODO
        return null;
    }
    public Bread checkWitchMake(Flour flour){
        //TODO
        return null;
    }
    public Bread checkWhichMake(Flour flour1 , Flour flour2){
        //TODO
        return null;
    }
    public boolean upgrade(Coin coin){
        //TODO
        return true;
    }
}
