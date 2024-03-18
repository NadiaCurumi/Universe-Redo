package pgdp.universe;

public abstract class Mammal extends Animal implements Viviparous {

    protected final byte numberOfTeats = 100;
    public Mammal(String name, Sex sex, byte numberOfTeats) {
        super(name, sex);
    }

    @Override
    public boolean breedWith(Animal animal) {
        return false;
    }
    public void suckle(){
        System.out.println(toString() + ConsoleOutputs.IS_SUCKLING);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
