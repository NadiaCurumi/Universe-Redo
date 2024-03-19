package pgdp.universe;

public class Platypus extends Mammal implements Oviparous{


    public Platypus(String name, Sex sex) {
        super(name, sex, (byte) 0);
    }


    @Override
    public boolean breedWith(Animal animal) {
        if (animal instanceof Platypus p && sex != animal.sex){
            if (sex == Sex.FEMALE){
                layEgg();
            }else {
                p.layEgg();
            }
            return true;
        }
        return false;
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
