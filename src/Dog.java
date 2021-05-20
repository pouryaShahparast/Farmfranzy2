import model.GameFieldStorage;

import java.util.Random;

public class Dog extends Animal{

    public void attackWildAnimal(){
        for (WildAnimal wildAnimal : GameFieldStorage.wildAnimalHashSet) {
            if((xCoordinate == wildAnimal.getXCoordinate()) && (yCoordinate == wildAnimal.getYCoordinate())){
                GameFieldStorage.wildAnimalHashSet.remove(wildAnimal);
                GameFieldStorage.dogHashSet.remove(this);
                break;
            }
        }
    }
    @Override
    public void move() {
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
}
