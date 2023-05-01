public class Bread extends Product{

    private final String color;

    public Bread(String name, Integer coast, String color) {
        super(name, coast);


        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + color;
    }
}
