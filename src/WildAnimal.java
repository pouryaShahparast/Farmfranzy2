import model.GameFieldStorage;
import model.commodities.Commodity;

import java.util.HashSet;

public abstract class WildAnimal extends Animal {
    public static final int WILD_ANIMAL_SIZE = 15;
    public static final int MAX_TURNS_AFTER_CAGED = 5;
    boolean isCaged;
    boolean isCagedInThisRound;
    int currentCageNumber;
    public void attackDomesticatedAnimals(){
        HashSet<model.animals.DomesticatedAnimal> removedDomesticatedAnimals = new HashSet<>();
        for (model.animals.DomesticatedAnimal domesticatedAnimal : GameFieldStorage.domesticatedAnimalHashSet) {
            if((xCoordinate == domesticatedAnimal.getXCoordinate()) && (yCoordinate == domesticatedAnimal.getYCoordinate())){
                removedDomesticatedAnimals.add(domesticatedAnimal);
            }
        }
        for (model.animals.DomesticatedAnimal removedDomesticatedAnimal : removedDomesticatedAnimals) {
            GameFieldStorage.domesticatedAnimalHashSet.remove(removedDomesticatedAnimal);
        }
    }
    public void attackCommodities(){
        HashSet<Commodity> removedCommodities = new HashSet<>();
        for (Commodity commodity : GameFieldStorage.commodityHashSet) {
            if((xCoordinate == commodity.getXCoordinate()) && (yCoordinate == commodity.getYCoordinate())){
                removedCommodities.add(commodity);
            }
        }
        for (Commodity removedCommodity : removedCommodities) {
            GameFieldStorage.commodityHashSet.remove(removedCommodity);
        }
    }
    public WildAnimal() {
        super();
        this.isCaged = false;
        this.currentCageNumber =0;
    }
    abstract boolean addCage();
    public boolean removeCage(){
        if(!isCaged && !isCagedInThisRound) {
            if (currentCageNumber > 0) {
                currentCageNumber--;
                return true;
            }
        }
        return false;
    }
    public void setIsCagedInThisRoundAtEndOfTheRound() {
        isCagedInThisRound = false;
    }
    abstract public void move();
}
