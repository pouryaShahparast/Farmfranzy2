import model.factories.Factory;

import java.util.HashSet;

public class GameFieldStorage {
    public static HashSet<DomesticatedAnimal> domesticatedAnimalHashSet;
    public static HashSet<Dog> dogHashSet = new HashSet<>();
    public static HashSet<Cat> catHashSet = new HashSet<>();
    public static HashSet<WildAnimal> wildAnimalHashSet = new HashSet<>();
    public static HashSet<Factory> factoryHashSet = new HashSet<>();
    public static HashSet<Commodity> commodityHashSet = new HashSet<>();
    public static HashSet<Grass> grassHashSet = new HashSet<>();
    public GameFieldStorage() {
    }
}
