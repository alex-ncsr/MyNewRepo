package md.tekwill.homework.lesson10;

public class Task2 {
    /*  Creati o metoda care calculeaza si afiseaza suma tuturor numerelor
    de la 0< n (n sa fie dinamic: ca argument). De ex. n=5 - suma pina la 5 este 10  */
    public static int sumFactorial(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += i;
        }
        return result;
    }

    /*  Creati o metoda care afiseaza toate cifrele pare pina la un nr n
    (n sa fie dinamic: ca argument). De ex. n=5, cifrele pare pina la 5 sunt 0,2,4  */
    public static void evenNumbers(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Creati o metoda care afiseaza la ecran "Hello" de 10 ori
    public static void hello(){
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i + " hello!");
        }
    }

    /*Creati o metoda care afiseaza toate cifrele impare pina la un nr n
    (n sa fie dinamic: ca argument). De ex. n=5, cifrele pare pina la 5 sunt 1,3   */
    public static void oddNumbers(int n) {

        int a = 0;
        while (++a < n) {
            if (a % 2 != 0) {
                System.out.print(a + " ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(sumFactorial(5));
        evenNumbers(10);
        System.out.println();
        hello();
        oddNumbers(21);
    }
}
