package factories;

import model.Coin;
import model.commodities.Milk;
import model.commodities.PocketMilk;

public class MilkPocketingProduction extends PrimitiveFactory{
    public static final int MILK_POCKETING_PRODUCTION_CONSTRUCTION_PRICE = 400;
    public static final int TIME_NEEDED_TO_MAKE_POCKET_MILK_WITHOUT_UPGRADE = 6;
    public static final int TIME_NEEDED_TO_MAKE_POCKET_MILK_WITH_UPGRADE = 3;
    private PocketMilk makeUpgraded(Milk milk){
        //TODO
        return null;
    }
    private PocketMilk makeUpgraded(Milk milk1 , Milk milk2){
        //TODO
        return null;
    }
    private PocketMilk makeNotUpgraded(Milk milk){
        //TODO
        return null;
    }
    public PocketMilk checkWitchMake(Milk milk){
        //TODO
        return null;
    }
    public PocketMilk checkWhichMake(Milk milk1 , Milk milk2){
        //TODO
        return null;
    }
    public boolean upgrade(Coin coin){
        //TODO
        return true;
    }
}
