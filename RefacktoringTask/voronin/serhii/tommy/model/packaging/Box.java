package ua.pp.voronin.serhii.tommy.model.packaging;

public class Box {

    private int side; // в міліметрах

    public Box(int side) {
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
        return "ящик {" + side + '*' + side + '*' + side + '}';
    }

    public int calculateBoxPrice(int pricePerMeter) {
        int boxSize = getSide();
        int boxArea = 6 * boxSize * boxSize ; // площа поверхні куба в мм²
        double pricePerMilimeter = pricePerMeter / 1000d / 1000d;
        return (int) Math.ceil(boxArea * pricePerMilimeter);
    } // Підказка: чи має цей класс займатися вирахуванням вартості ящику?
}
