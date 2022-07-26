package md.tekwill.homework.lesson10;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.title = "Asus";
        computer.weight = 2;
        computer.ramValue = 1000;

        System.out.println("Brand - " + computer.getTitle());

        computer.ssd = computer.ssdValue(200);
        System.out.println("Volume ssd is " + computer.ssd + " Gb");

        computer.info("Japan", "2022");

        System.out.println(computer.charToInt('a'));
    }
}
