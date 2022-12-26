import java.lang.Class;
import java.lang.reflect.*;
public class Launching extends Animal {
    public static void main(String[] args) {
        try {
            Animal animal1=new Animal ();// create an object of Animal class

            Class obj1 = animal1.getClass ();  // get Class object using getClass()


            Field animal_field = obj1.getField("AnimalName");
            System.out.println("Details of Animal class field:");
            animal_field.set(animal1, "Bob"); // set the value of field

            Field animalType_field = obj1.getField("TypeOFAnimal");
            animalType_field.set(animal1, "Creature"); // set the value of field

            int mod1 = animal_field.getModifiers();
            String modifier1 = Modifier.toString(mod1);
            System.out.println("Animal modifier is: " + modifier1);
            String typeValue = (String)animal_field.get(animal1);
            System.out.println("Animal name is: " + typeValue);
            Method[] methods = obj1.getDeclaredMethods();

            int mod3 = animalType_field.getModifiers();
            String modifier3 = Modifier.toString(mod3);
            System.out.println("\nAnimal modifier is: " + modifier3);
            String typeValue2 = (String)animalType_field.get(animal1);
            System.out.println("Animal type is: " + typeValue2);


            for(Method m : methods) {
                System.out.println("\nMethod Name: " + m.getName()+" -> [I can walk] ");
                int modifier = m.getModifiers();
                System.out.print("Modifier: " + Modifier.toString(modifier) + "  \n");

                // get the return type of method
                System.out.print("Return Type: " + m.getReturnType());
                System.out.println("\n");
            }
            Field field2 = obj1.getDeclaredField("quantityOfLegs");
            field2.setAccessible(true);
            field2.set(animal1, "4");
            System.out.println("Field Information of quantityOfLegs:");
            int mod2 = field2.getModifiers();
            String modifier2 = Modifier.toString(mod2);
            System.out.println("Animal modifier is : " + modifier2);
            // get the value of rollNo converting in String
            String CatValue = (String)field2.get(animal1);
            System.out.println("Animal have : " + CatValue +" legs");


        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}





