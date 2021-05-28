package controller;

import model.*;
import model.animals.Cat;
import model.animals.Dog;
import model.animals.DomesticatedAnimal;
import model.animals.WildAnimal;
import model.commodities.Commodity;
import model.factories.Factory;

import java.util.ArrayList;

public class InGameManager {
    Storeroom storeroom;
    Coin coin;
    Well well;
    PickUpTruck pickUpTruck;
    public void game(){
        moving();
        catWork();
        dogWorks();
        wildAnimalWorks();
        domesticatedAnimalWorks();
        commodityWorks();
        factoryWorks();
        pickUpTruckWorks();
        wellWorks();
    }
    private void moving(){
        for (DomesticatedAnimal domesticatedAnimal : GameFieldStorage.domesticatedAnimalHashSet) {
            domesticatedAnimal.move();
        }
        for (Cat cat : GameFieldStorage.catHashSet) {
            cat.move();
        }
        for (Dog dog : GameFieldStorage.dogHashSet) {
            dog.move();
        }
        for (WildAnimal wildAnimal : GameFieldStorage.wildAnimalHashSet) {
            wildAnimal.move();
        }
    }
    private void catWork(){
        for (Cat cat : GameFieldStorage.catHashSet) {
            cat.pickupCommodity(storeroom);
        }
    }
    private void dogWorks(){
        for (Dog dog : GameFieldStorage.dogHashSet) {
            dog.attackWildAnimal();
        }
    }
    private void wildAnimalWorks(){
        for (WildAnimal wildAnimal : GameFieldStorage.wildAnimalHashSet) {
            wildAnimal.attackDomesticatedAnimals();
        }
        for (WildAnimal wildAnimal : GameFieldStorage.wildAnimalHashSet) {
            wildAnimal.attackCommodities();
        }
        for (WildAnimal wildAnimal : GameFieldStorage.wildAnimalHashSet) {
            wildAnimal.removeCage();
        }
        for (WildAnimal wildAnimal : GameFieldStorage.wildAnimalHashSet) {
            wildAnimal.addTurnsAfterCaged();
        }
        for (WildAnimal wildAnimal : GameFieldStorage.wildAnimalHashSet) {
            wildAnimal.removeFromGameFieldIfTurnsReached();
        }
    }
    private void domesticatedAnimalWorks(){
        for (Grass grass : GameFieldStorage.grassHashSet) {
            DomesticatedAnimal domesticatedAnimal = whichAnimalEats(grass.getDomesticatedAnimals());
            if(domesticatedAnimal != null){
                domesticatedAnimal.eat(grass);
            }
        }
        for (DomesticatedAnimal domesticatedAnimal : GameFieldStorage.domesticatedAnimalHashSet) {
            domesticatedAnimal.reduceHealth();
        }
        for (DomesticatedAnimal domesticatedAnimal : GameFieldStorage.domesticatedAnimalHashSet) {
            domesticatedAnimal.removeIfIsDead();
        }
        for (DomesticatedAnimal domesticatedAnimal : GameFieldStorage.domesticatedAnimalHashSet) {
            domesticatedAnimal.ProduceWithTurns();
        }
    }
    private void commodityWorks(){
        for (Commodity commodity : GameFieldStorage.commodityHashSet) {
            commodity.addTurnsInField();
        }
        for (Commodity commodity : GameFieldStorage.commodityHashSet) {
            commodity.removeFromGameFieldIfTurnsReached();
        }
    }
    private void factoryWorks(){
        for (Factory factory : GameFieldStorage.factoryHashSet) {
            factory.makeOneCommodityWithTurn();
            factory.makeTwoCommodityWithTurn();
        }
    }
    private void pickUpTruckWorks(){
        pickUpTruck.sellWithTurns(coin);
    }
    private void wellWorks(){
        well.getWaterWithTurns();
    }
    private DomesticatedAnimal whichAnimalEats(ArrayList<DomesticatedAnimal> domesticatedAnimalArrayList){
        if(!domesticatedAnimalArrayList.isEmpty()){
            int tern = 0;
            int health = domesticatedAnimalArrayList.get(1).getHealth();
            for (int i = 0; i < domesticatedAnimalArrayList.size(); i++) {
                if(domesticatedAnimalArrayList.get(i).getHealth() < health){
                    tern = i;
                    health = domesticatedAnimalArrayList.get(i).getHealth();
                }
            }
            if(health < 50) {
                return domesticatedAnimalArrayList.get(tern);
            }
        }
        return null;
    }

}
