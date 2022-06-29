import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        BonusMilesService service=new BonusMilesService();
        System.out.println("Покупка на сумму 500");
        int miles=service.calculate(500);     // колличество миль начисленных за покупку билета
        System.out.println("Начислено миль:" +miles);

        System.out.println();
        System.out.println("Покупка на сумму 2000");
        System.out.println("Начислено миль:" + service.calculate(2000));

        System.out.println();
        System.out.println("Покупка на сумму 1");
        System.out.println("Начислено миль:" + service.calculate(1));
    }
}
