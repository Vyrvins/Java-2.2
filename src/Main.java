public class Main {
    public static void main(String[] args) {
        int a = 100; // сумма начального счета
        int b = 1100; // сумма пополнения
        int bonus = (b) / 100;
        if (b>= 1000) {
            System.out.println("Cумма бонусов " + bonus);
        } else {
            System.out.println("Cумма бонусов " + 0);
        }
        System.out.println("Итоговая сумма на счете " + (a + b + bonus));

    }
}