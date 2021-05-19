public abstract class Commodity {
    private int turnsInField;
    private int xCoordinate;
    private int yCoordinate;
    void addTurnsInField(){
        turnsInField++;
    }
    public int getTurnsInField() {
        return turnsInField;
    }

    public void setTurnsInField(int turnsInField) {
        this.turnsInField = turnsInField;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public Commodity(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.turnsInField = 0;
    }
}
