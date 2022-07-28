package md.tekwill.homework.lesson11.A;

public class Cat {

    public String name;
    int weight;


    private int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    void eat() {
        System.out.println("Cat eating");
    }

    private void sleep() {
        System.out.println("Quiet! The cat is sleeping now!!!");
    }


    public void info() {
        eat();
        System.out.println(getName());
        System.out.println(getWeight());
        sleep();
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
    }
}
