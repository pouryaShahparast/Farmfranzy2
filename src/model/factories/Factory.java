package model.factories;

import model.Coin;
import model.Storeroom;

public abstract class Factory {
    boolean upgraded;
    boolean workingWhileUpgrade;
    boolean working;
    boolean workingOneCommodity;
    boolean workingTwoCommodity;
    int turns;

    public boolean isUpgraded() {
        return upgraded;
    }
    public abstract boolean upgrade(Coin coin);

    public abstract void make();
    public abstract boolean startWorkingOneCommodity(Storeroom storeroom);
    public abstract boolean startWorkingTwoCommodities(Storeroom storeroom);
    public void addTurns(){
        turns++;
    }
    public void makeOneCommodityWithTurn(){
        if(working && workingOneCommodity){
            if(upgraded && !workingWhileUpgrade){
                if(checkIfTurnsReachedUpgraded()){
                    make();
                    workFinishedChanges();
                }else {
                    addTurns();
                }
            }else {
                if(checkIfTurnsReachedNotUpgraded()){
                    make();
                    workFinishedChanges();
                }else {
                    addTurns();
                }
            }
        }
    }
    public void makeTwoCommodityWithTurn(){
        if(working && workingTwoCommodity){
            if(upgraded && !workingWhileUpgrade){
                if(checkIfTurnsReachedNotUpgraded()){
                    make();
                    make();
                    workFinishedChanges();
                }else {
                    addTurns();
                }
            }
        }
    }
    public abstract boolean checkIfTurnsReachedUpgraded();
    public abstract boolean checkIfTurnsReachedNotUpgraded();
    public void workFinishedChanges(){
        workingTwoCommodity = false;
        workingOneCommodity = false;
        working = false;
        workingWhileUpgrade = false;
        turns = 1;
    }

    public Factory() {
        upgraded = false;
        workingWhileUpgrade = false;
        working = false;
        workingOneCommodity = false;
        workingTwoCommodity = false;
        turns = 1;
    }
}
