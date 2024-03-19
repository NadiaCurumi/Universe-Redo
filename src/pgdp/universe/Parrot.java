package pgdp.universe;

public class Parrot extends Bird {

    public Parrot(String name, Sex sex, byte[] melody) {
        super(name, sex, melody);
    }

    @Override
    public boolean breedWith(Animal animal) {
        if (animal instanceof Parrot p && sex != animal.sex){
            if (animal.sex == Sex.FEMALE){
                layEgg();
            }else {
                p.layEgg();
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
