package pgdp.universe;

public class Platypus extends Mammal implements Oviparous{
    public Platypus(String name, Sex sex, byte numberOfTeats) {
        super(name, sex, numberOfTeats);
    }

    @Override
    public boolean breedWith(Animal animal) {
        return super.breedWith(animal);
    }

    @Override
    public void suckle() {
        super.suckle();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void layEgg() {
        Oviparous.super.layEgg();
    }
}
