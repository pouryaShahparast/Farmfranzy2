import java.util.Random;

public class Tiger extends model.animals.WildAnimal {
    public static final int TIGER_CAGES_NEEDED = 4;
    public static final int TIGER_SELL_PRICE = 500;
    public MOVE_DIRECTIONS lastMoveDirection;
    public Tiger() {
        super();
    }

    @Override
    boolean addCage() {
        if(!isCaged){
            currentCageNumber++;
            if(currentCageNumber == TIGER_CAGES_NEEDED){
                isCaged = true;
            }
            isCagedInThisRound = true;
            return true;
        }
        return false;
    }

    public void move() {
        Random random = new Random();
        boolean canMove = false;
        while (!canMove){
            int a = random.nextInt(4);
            switch (a){
                case 0:
                    if(xCoordinate - 2 >= 0){
                        xCoordinate -= 2;
                        lastMoveDirection = MOVE_DIRECTIONS.LEFT;
                        canMove = true;
                    }
                    break;
                case 1:
                    if(xCoordinate + 2 < 6){
                        xCoordinate += 2;
                        lastMoveDirection = MOVE_DIRECTIONS.RIGHT;
                        canMove = true;
                    }
                    break;
                case 2:
                    if (yCoordinate - 2 >= 0){
                        yCoordinate -= 2;
                        lastMoveDirection = MOVE_DIRECTIONS.DOWN;
                        canMove = true;
                    }
                    break;
                case 3:
                    if (yCoordinate + 2 < 6){
                        yCoordinate += 2;
                        lastMoveDirection = MOVE_DIRECTIONS.UP;
                        canMove = true;
                    }
                    break;
            }
        }
    }
}
