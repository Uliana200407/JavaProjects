package ua.pp.voronin.serhii.tommy;

import ua.pp.voronin.serhii.tommy.exception.PackagingException;
import ua.pp.voronin.serhii.tommy.model.packaging.Box;
import ua.pp.voronin.serhii.tommy.model.part.Cube;
import ua.pp.voronin.serhii.tommy.model.part.Part;
import ua.pp.voronin.serhii.tommy.model.part.Sphere;
import ua.pp.voronin.serhii.tommy.model.part.Tetrahedron;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class PartsProcessor {

    public void packageParts(Collection<Part> parts, Collection<Box> boxes, int boxPackagingPricePerMillimeter) {
        // Наявні коробки
        List<Box> availableBoxes = new ArrayList<>(boxes);

        // Сортуємо ящики від малих до великих, щоб спросити пошук. Будемо перебирати від малих до великих
        availableBoxes.sort(Comparator.comparing(Box::getSide));

        for (Part part : parts) {
            try {
                Box box = selectSmallestBox(part, availableBoxes);
                int boxPrice = box.calculateBoxPrice ( boxPackagingPricePerMillimeter);
                reportRecommendedPackaging(part, box, boxPrice);
                availableBoxes.remove(box);
            } catch (PackagingException e) {
                reportUnableToPackage(part);
            }
        }
    }

    private Box selectSmallestBox(Part part, List<Box> boxesSorted) {

        int FinalBoxSize = getFinalBoxSize ( part );

        for (Box box : boxesSorted) {
            if (box.getSide() >= FinalBoxSize) {
                return box;
            }
        }
        // Якщо в циклі ми не знайшли жодного підходящого ящика, повідомимо про це за допомогою кидання виключення
        throw new PackagingException();
    }

    private static int getFinalBoxSize(Part part) {
        int FinalBoxSize = switch (part) {
            case Cube c -> c.getSide();
            case Sphere s -> s.getRadius() * 2;
            case Tetrahedron t -> (int) Math.ceil(t.getSide() / Math.sqrt(2));
        };
        int volume = switch (part) {
            case Cube c -> c.getSide() * c.getSide() * c.getSide();
            case Sphere s -> (int) Math.ceil(4d / 3 * Math.PI * s.getRadius() * s.getRadius() * s.getRadius());
            case Tetrahedron t -> (int) Math.ceil(Math.sqrt(2) / 12 * t.getSide() * t.getSide() * t.getSide());
        };
        int weight = (int) Math.ceil(volume * part.getDensity());

        double protectiveLayerThickness = part.getProtectiveLayerThickness(weight);

        FinalBoxSize += protectiveLayerThickness * 2; // захисний шар потрібен з обох боків
        return FinalBoxSize;
    }

    private void reportRecommendedPackaging(Part part, Box box, int price) {
        String message = String.format(
                "Деталь %s варто покласти у ящик %s. Вартість пакування: %.2f₴",
                part, box, price / 100d);
        System.out.println(message);
    }

    private void reportUnableToPackage(Part part) {
        String message = String.format(
                "Деталь %s не вдалося розмістити у наявні ящики",
                part);
        System.out.println(message);
    }
}
