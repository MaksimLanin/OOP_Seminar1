public class Yogurt extends Product{// примере наследования, мы создаем новый класс йогурт, и наследуем его из класса прродукт

    private final String flavor;

    public Yogurt(String name, Integer coast, String flavor) {
        super(name, coast);

        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + flavor;
    }
}
