package ua.pp.voronin.serhii.tommy.model.part;

sealed public abstract class Part permits Cube, Sphere, Tetrahedron {

    private double density; // густина, в грамах на 1 мм³

    public Part(double density) {
        this.density = density;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getProtectiveLayerThickness(double weightInGrams) {
        double weightInKilograms = weightInGrams / 1000;
        return weightInKilograms / 30; // Підказка: це є магічною цифрою
    }
}
