package generic.unit;

public class Shuttle<T extends BioUnit> {

    private T starcraft;

    public void in(T t) {
        starcraft = t;
    }

    public T getUnit() {
        return starcraft;
    }

    public T out() {
        return starcraft;
    }

    public void showInfo() {
        System.out.println(starcraft.getName() + starcraft.getHp());
    }

}
