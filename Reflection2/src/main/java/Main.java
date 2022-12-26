
    import java.lang.reflect.*;

    interface Animal {
        void printFields();
    }


    class Cat implements Animal {
        private String name;
        private Integer old, weight;

        public void setFields(String name, Integer old, Integer weight) {
            this.name = name;
            this.old = old;
            this.weight = weight;
        }

        @Override
        public void printFields() {
            System.out.println(name + " " + old + " " + weight);
        }
    }


    public class Main {
        public static void main(String[] args) {
            Cat some_cat = new Cat();

            interactDirectly(some_cat, "Vasya", 2, 4);
            some_cat.printFields();

            try {
                interactWithReflection(some_cat, "Jora", 3, 7);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }

        private static void interactDirectly(Cat cat, String name, Integer old, Integer weight) {
            cat.setFields(name, old, weight);
        }

        private static void interactWithReflection(Cat cat, String name, Integer old, Integer weight) throws IllegalAccessException, InvocationTargetException {
            Class<? extends Cat> rClass = cat.getClass();

            for (Field field : rClass.getDeclaredFields()) {
                if ("name".equals(field.getName())) {
                    field.setAccessible(true);
                    Object oldValue = field.get(cat);
                    field.set(cat, name);
                    System.out.printf("Замінили старе значення %s на нове %s %n", oldValue, name);
                }

                if ("old".equals(field.getName())) {
                    field.setAccessible(true);
                    Object oldValue = field.get(cat);
                    field.set(cat, old);
                    System.out.printf("Замінили старе значення %s на нове %s %n", oldValue, old);
                }

                if ("weight".equals(field.getName())) {
                    field.setAccessible(true);
                    Object oldValue = field.get(cat);
                    field.set(cat, weight);
                    System.out.printf("Замінили старе значення %s на нове %s %n", oldValue, weight);
                }
            }

            for (Method method : rClass.getDeclaredMethods()) {
                if ("printFields".equals(method.getName())) {
                    method.invoke(cat);
                }
            }
        }

    }
