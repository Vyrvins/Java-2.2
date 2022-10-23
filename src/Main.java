public class Main {
    public static void main(String[] args) {
        int a = 100000; // сумма начального счета
        int b = 500; // сумма пополнения
        int bonus = (a + b) / 100;
        if (a + b >= 1100) {
            System.out.println("Cумма бонусов " + bonus);
        } else {
            System.out.println("Cумма бонусов " + 0);
        }
        System.out.println("Итоговая сумма на счете " + (a + b));

    }
}