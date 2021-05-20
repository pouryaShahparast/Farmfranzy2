import model.GameFieldStorage;
import model.Grass;
import model.commodities.PrimitiveCommodity;

import java.util.HashSet;
import java.util.Random;

public abstract class DomesticatedAnimal extends Animal {
    int health;
    public void setHealth(int health) {
        this.health = health;
    }
    public int getHealth() {
        return health;
    }
    public DomesticatedAnimal() {
        super();
        health = 100;
    }
    public void reduceHealth(){
        health-= 10;
    }
    public abstract PrimitiveCommodity produce();
    boolean eat(Grass grass){
        if(health < 50) {
            if (GameFieldStorage.grassHashSet.remove(grass)) {
                health = 100;
                return true;
            }
        }
        return false;
    }
    void normalMove(){
        Random random = new Random();
        boolean canMove = false;
        while (!canMove){
            int a = random.nextInt(4);
            switch (a){
                case 0:
                    if(xCoordinate - 1 >= 0){
                        xCoordinate -= 1;
                        canMove = true;
                    }
                    break;
                case 1:
                    if(xCoordinate + 1 < 6){
                        xCoordinate += 1;
                        canMove = true;
                    }
                    break;
                case 2:
                    if (yCoordinate - 1 >= 0){
                        yCoordinate -= 1;
                        canMove = true;
                    }
                    break;
                case 3:
                    if (yCoordinate + 1 < 6){
                        yCoordinate += 1;
                        canMove = true;
                    }
                    break;
            }
        }
    }
    public void move() {
        Grass grass = findNearestGrass(GameFieldStorage.grassHashSet);
        if(grass == null){
            normalMove();
        }else {
            if ((grass.getXCoordinate() == xCoordinate) && (grass.getYCoordinate() != yCoordinate)) {
                if (grass.getYCoordinate() > yCoordinate) {
                    yCoordinate++;
                } else {
                    yCoordinate--;
                }
            } else if ((grass.getXCoordinate() != xCoordinate) && (grass.getYCoordinate() == yCoordinate)) {
                if (grass.getXCoordinate() > xCoordinate) {
                    xCoordinate++;
                } else {
                    xCoordinate--;
                }
            } else if ((grass.getXCoordinate() != xCoordinate) && (grass.getYCoordinate() != yCoordinate)) {
                Random random = new Random();
                if (random.nextBoolean()) {
                    if (grass.getYCoordinate() > yCoordinate) {
                        yCoordinate++;
                    } else {
                        yCoordinate--;
                    }
                } else {
                    if (grass.getXCoordinate() > xCoordinate) {
                        xCoordinate++;
                    } else {
                        xCoordinate--;
                    }
                }
            }
        }
    }
     Grass findNearestGrass(HashSet<Grass> grassHashSet) {
        double minDistance = -1;
        Grass grass = null;
        if(grassHashSet.isEmpty()){
            return null;
        }
        for (Grass grass1 : grassHashSet) {
            if((grass1.getYCoordinate()>=0)&&(grass1.getYCoordinate()<6)&&(grass1.getXCoordinate()>=0)&&(grass1.getXCoordinate()<6)) {
                double distance = Math.sqrt(Math.pow(xCoordinate - grass1.getXCoordinate(), 2) + Math.pow(yCoordinate - grass1.getYCoordinate(), 2));
                if ((minDistance == -1) || (minDistance > distance)) {
                    minDistance = distance;
                    grass = grass1;
                }
            }
        }
        return grass;
    }
}
