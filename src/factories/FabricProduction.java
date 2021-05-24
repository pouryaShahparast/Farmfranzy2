package factories;

import model.Coin;
import model.commodities.*;

public class FabricProduction extends PrimitiveFactory{
    public static final int FABRIC_PRODUCTION_CONSTRUCTION_PRICE = 250;
    public static final int TIME_NEEDED_TO_MAKE_FABRIC_WITHOUT_UPGRADE = 5;
    public static final int TIME_NEEDED_TO_MAKE_FABRIC_WITH_UPGRADE = 3;
    private Fabric makeUpgraded(Feather feather){
        //TODO
        return null;
    }
    private Fabric makeUpgraded(Feather feather1 , Feather feather2){
        //TODO
        return null;
    }
    private Fabric makeNotUpgraded(Feather feather){
        //TODO
        return null;
    }
    public Fabric checkWitchMake(Feather feather){
        //TODO
        return null;
    }
    public Fabric checkWhichMake(Feather feather1 , Feather feather2){
        //TODO
        return null;
    }
    public boolean upgrade(Coin coin){
        //TODO
        return true;
    }
}
