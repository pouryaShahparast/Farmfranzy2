package factories;

import model.Coin;

abstract class PrimitiveFactory extends Factory{
    public abstract boolean upgrade(Coin coin);
}
