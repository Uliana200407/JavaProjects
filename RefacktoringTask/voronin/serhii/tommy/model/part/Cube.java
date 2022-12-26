package ua.pp.voronin.serhii.tommy.model.part;

public final class Cube extends Part {

    private int side; // в міліметрах

    public Cube(int side, double density) {
        super(density);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "кубічна деталь {" + side + '*' + side + '*' + side + '}';
    }
}
