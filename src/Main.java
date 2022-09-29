public class Main {
    public static void main(String[] args) {
        long[] sales = {10_000, 20_000, 60_000, 100_000};
        SalesManager salesMan = new SalesManager(sales);
        System.out.println("Расчет среднего: " + salesMan.statistik());
    }
}
