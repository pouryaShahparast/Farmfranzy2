import model.commodities.FinalCommodity;
import model.commodities.IntermediaryCommodity;
import model.commodities.PrimitiveCommodity;

import java.util.HashSet;

public class PickUpTruck {
    public static final int MAX_CAPACITY = 15;
    public static final int TIME_NEEDED_TO_SELL = 10;
    TurnsController turnsController;
    HashSet<Object> pickUpTruckHashset;
    int truckSpaceTaken;

    public PickUpTruck() {
        pickUpTruckHashset= new HashSet<>();
        turnsController = new TurnsController(TIME_NEEDED_TO_SELL);
        truckSpaceTaken = 0;
    }

    public boolean pickUp(Object object){
        if(object instanceof WildAnimal){
            if(canPick(WildAnimal.WILD_ANIMAL_SIZE)){
                truckSpaceTaken += WildAnimal.WILD_ANIMAL_SIZE;
                pickUpTruckHashset.add(object);
                return true;
            }
        }else if(object instanceof PrimitiveCommodity){
            if(canPick(PrimitiveCommodity.PRIMITIVE_COMMODITY_SIZE)){
                truckSpaceTaken += PrimitiveCommodity.PRIMITIVE_COMMODITY_SIZE;
                pickUpTruckHashset.add(object);
                return true;
            }
        }else if(object instanceof IntermediaryCommodity){
            if(canPick(IntermediaryCommodity.INTERMEDIARY_COMMODITY_SIZE)){
                truckSpaceTaken += IntermediaryCommodity.INTERMEDIARY_COMMODITY_SIZE;
                pickUpTruckHashset.add(object);
                return true;
            }
        }else if(object instanceof FinalCommodity){
            if(canPick(FinalCommodity.FINAL_COMMODITY_SIZE)){
                truckSpaceTaken += FinalCommodity.FINAL_COMMODITY_SIZE;
                pickUpTruckHashset.add(object);
                return true;
            }
        }
        return false;
    }
    public void sellTruckFurniture(Coin coin){
        if(turnsController.turnsReached()){
            //TODO
            turnsController.resetTimeControllerIfTurnsReached();
        }else {
            turnsController.passTurn();
        }
    }
    public boolean conditionalUnlockOfTurnsController(){
        return turnsController.conditionalUnlock();
    }
    public boolean canPick(int a){
        return a + truckSpaceTaken <= MAX_CAPACITY;
    }
}
