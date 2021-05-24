package factories;

import model.Coin;

public abstract class Factory {
    boolean upgraded;

    public boolean isUpgraded() {
        return upgraded;
    }
    public abstract boolean upgrade(Coin coin);
}
