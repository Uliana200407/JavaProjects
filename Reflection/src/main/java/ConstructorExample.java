import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ConstructorExample {

    public static void main(String[] args) throws NoSuchMethodException,
            SecurityException, InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        Class < Cat > aClass = Cat.class;
        Constructor<?> constructor = aClass.getConstructor(String.class,
                int.class);
        Class < ? >[] paramClasses = constructor.getParameterTypes ();
        for (Class < ? > paramClass : paramClasses) {
            System.out.println ( "\nParameters of different cats: " + paramClass.getSimpleName () );
            Cat Chelsea = new Cat("Chelsea", 3);
            System.out.println("Cat 1: " + Chelsea.getName() + ", age => " + Chelsea.getAge());
            Cat Coconut = new Cat("Coconut", 12);
            System.out.println("Cat 2: " + Coconut.getName() + ", age => " + Coconut.getAge());
            Cat Murka = new Cat("Murka", 1);
            System.out.println("Cat 3: " + Murka.getName() + ", age => " + Murka.getAge());


            Class<Cat> bClass = Cat.class;
            Method getAgeMethod = aClass.getMethod("getAge");
            Class<?> returnType= getAgeMethod.getReturnType();
            System.out.println("\nReturn type of getAge: "+ returnType.getSimpleName());
            Cat Lucas = new Cat("Lucas", 7);
            System.out.println("Cat 3: " + Lucas.getName() + ", age => " +Lucas.getAge());
            int age = (int) getAgeMethod.invoke(Lucas);
            System.out.println("Old value of age= " + age);
            Method setAgeMethod = aClass.getMethod("setAge", int.class);


            // Call method setAge(int) way Reflect
            // This is equivalent to calling: tom.setAge(5)
            setAgeMethod.invoke(Lucas, 5);

            System.out.println("New value of age = " + Lucas.getAge());

        }


        }
    }

