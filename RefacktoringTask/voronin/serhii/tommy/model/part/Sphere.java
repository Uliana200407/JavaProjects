package ua.pp.voronin.serhii.tommy.model.part;

public final class Sphere extends Part {

    private int radius; // в міліметрах

    public Sphere(int radius, double density) {
        super(density);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "сферична деталь {r=" + radius + '}';
    }
}
