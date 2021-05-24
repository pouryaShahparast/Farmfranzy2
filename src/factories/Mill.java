package factories;

import model.Coin;
import model.commodities.*;

public class Mill extends PrimitiveFactory{
    public static final int MILL_CONSTRUCTION_PRICE = 150;
    public static final int TIME_NEEDED_TO_MAKE_FLOUR_WITHOUT_UPGRADE = 4;
    public static final int TIME_NEEDED_TO_MAKE_FLOUR_WITH_UPGRADE = 2;
     private Flour makeUpgraded(Egg egg){
         //TODO
         return null;
     }
    private Flour makeUpgraded(Egg egg1 , Egg egg2){
         //TODO
        return null;
    }
    private Flour makeNotUpgraded(Egg egg){
         //TODO
        return null;
    }
    public Flour checkWitchMake(Egg egg){
         //TODO
        return null;
    }
    public Flour checkWhichMake(Egg egg1 , Egg egg2){
         //TODO
        return null;
    }
    public boolean upgrade(Coin coin){
        //TODO
        return true;
    }
}
