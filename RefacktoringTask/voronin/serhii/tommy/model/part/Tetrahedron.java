package ua.pp.voronin.serhii.tommy.model.part;

public final class Tetrahedron extends Part {

    private int side; // в міліметрах

    public Tetrahedron(int side, double density) {
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
        return "пірамідальна деталь {a=" + side + '}';
    }
}
