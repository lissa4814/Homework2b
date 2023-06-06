// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int initial = 500;
        int sum = 1500;


        int bonus;
        if (sum > 1000) {
            bonus = ( sum / 100 );
        } else {
            bonus = 0;
        }

        System.out.println("Сумма бонуса: " + bonus );
        System.out.println("Итоговая сумма: " + (initial + sum + bonus) );

    }
}