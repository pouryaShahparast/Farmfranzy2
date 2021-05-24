package factories;

import model.Coin;
import model.Storeroom;
import model.TurnsController;
import model.commodities.IceCream;

public class IceCreamMaker extends SecondaryFactory{
    public static final int ICE_CREAM_MAKER_CONSTRUCTION_PRICE = 550;
    public static final int TIME_NEEDED_TO_MAKE_ICE_CREAM_WITHOUT_UPGRADE = 7;
    public static final int TIME_NEEDED_TO_MAKE_ICE_CREAM_WITH_UPGRADE = 4;
    public static final int ICE_CREAM_UPGRADE_PRICE = 275;
    TurnsController turnsControllerUpdated;
    TurnsController turnsControllerNotUpdated;
    private IceCream makeUpgradedWithOneInput(){
        //TODO
        return null;
    }
    private IceCream makeUpgradedWithTwoInputs(){
        //TODO
        return null;
    }
    private IceCream makeNotUpgraded(){
        //TODO
        return null;
    }
    public IceCream checkWhichMakeWithOneInput(){
        //TODO
        return null;
    }
    public IceCream checkWhichMakeWithTwoInput(){
        //TODO
        return null;
    }
    public boolean canMakeTwoProducts(Storeroom storeroom){
        return storeroom.numberOfPocketMilks() >= 2;
    }
    public boolean upgrade(Coin coin){
        if((!upgraded) && (coin.hasEnoughCoins(ICE_CREAM_UPGRADE_PRICE))) {
            coin.reduceCoin(ICE_CREAM_UPGRADE_PRICE);
            turnsControllerUpdated = new TurnsController(TIME_NEEDED_TO_MAKE_ICE_CREAM_WITH_UPGRADE);
            upgraded = true;
        }
        return upgraded;
    }

    public IceCreamMaker() {
        turnsControllerNotUpdated = new TurnsController(TIME_NEEDED_TO_MAKE_ICE_CREAM_WITHOUT_UPGRADE);
    }
}
