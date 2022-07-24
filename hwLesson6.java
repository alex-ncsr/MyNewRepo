public class hwLesson6 {

    public static void main(String[] args) {
        int param = 8;
//        int param = 13;
//        int param = 5;
//        int param = 27;
//        int param = 22;

        if (param % 2 == 0 & param > 10) {
            System.out.println("Number is even");
        } else if (param % 2 != 0 & param < 15) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number does not satisfy one of the conditions ");
        }
    }
}