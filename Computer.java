package md.tekwill.homework.lesson10;

public class Computer {
    String title;
    int ssd;
    double weight;
    long ramValue;

    public int ssdValue(int ssd) {
        return ssd;
    }

    public String getTitle() {
        return title;
    }

    public void info(String country, String yearOfIssue) {
        System.out.println("Producing country is " + country +
                " ; Year of issue - " + yearOfIssue);
    }

    public int charToInt(char c) {
        return c;
    }
}
