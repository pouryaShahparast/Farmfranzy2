public class Well {
    static final int TURNS_NEEDED_TO_GET_WATER = 3;
    int bucketWater;
    public void getWater(){
        bucketWater = 5;
    }
    public Grass makeGrass(int xLocation ,int yLocation){
        if((xLocation >= 0) && (xLocation < 6) && (yLocation >= 0) && (yLocation < 6)) {
            if (bucketWater > 0) {
                bucketWater--;
                return new Grass(xLocation , yLocation);
            }
        }
        return null;
    }
}
