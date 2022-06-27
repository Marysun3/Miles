import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int ticket = 505;   // стоимость билета
        int bonus = 20;      // колличество рублей для 1 милл
        int miles = ticket / bonus;     // колличество миль начисленных за покупку билета
        System.out.println(miles);
    }
}
