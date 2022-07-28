package md.tekwill.homework.lesson11.A;

public class CatTest {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Tom";
        cat.weight = 3;
//        cat.getWeight(); - compile time error
        System.out.println(cat.getName()); // output: Tom
        cat.eat(); // output: Cat eating
//       cat.sleep(); - compile time error
        System.out.println("********************");
        cat.info();
    }
}
