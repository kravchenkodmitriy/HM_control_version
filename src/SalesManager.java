import java.util.stream.LongStream;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
            for (long sale : sales){
                if (sale > max){
                    max = sale;
                }
            }
        return max;
    }

    public long min() {
        long min = 100_000;
            for (long sale : sales){
                if (sale < min){
                    min = sale;
                }
            }
            return min;
    }

    public long statistik(){
        long statistik = (LongStream.of(sales).sum() - max() - min()) / (sales.length - 2);
        return statistik;
    }
}
