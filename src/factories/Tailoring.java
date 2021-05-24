package factories;

import model.Coin;
import model.commodities.Cloth;
import model.commodities.Fabric;

public class Tailoring extends SecondaryFactory{
    public static final int TAILORING_CONSTRUCTION_PRICE = 400;
    public static final int TIME_NEEDED_TO_MAKE_CLOTH_WITHOUT_UPGRADE = 6;
    public static final int TIME_NEEDED_TO_MAKE_CLOTH_WITH_UPGRADE = 3;
    private Cloth makeUpgraded(Fabric fabric){
        //TODO
        return null;
    }
    private Cloth makeUpgraded(Fabric fabric1 , Fabric fabric2){
        //TODO
        return null;
    }
    private Cloth makeNotUpgraded(Fabric fabric){
        //TODO
        return null;
    }
    public Cloth checkWitchMake(Fabric fabric){
        //TODO
        return null;
    }
    public Cloth checkWhichMake(Fabric fabric1 , Fabric fabric2){
        //TODO
        return null;
    }
    public boolean upgrade(Coin coin){
        //TODO
        return true;
    }
}
