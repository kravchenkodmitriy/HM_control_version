public class Main {
    public static void main(String[] args) {
        long[] sales = {10000L, 20000L, 60000L, 100000L};
        SalesManager salesMan = new SalesManager(sales);
        System.out.println("Расчет среднего: " + salesMan.statistik());
    }
}
