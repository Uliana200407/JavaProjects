
public class Cat extends Animal {
    public String CatName;
    private String AverageWeight;

    private String name;

    // Private field
    public int age;

    public Cat() {

    }

    public Cat(String name) {
        this.name = name;
        this.age = 1;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    // Private Method.
    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void DrinkMilk() {
        System.out.println("Mau,I'm sipping milk");}


}

