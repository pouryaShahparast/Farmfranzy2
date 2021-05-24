package factories;

import model.Coin;

abstract class SecondaryFactory extends Factory{
    public abstract boolean upgrade(Coin coin);
}
