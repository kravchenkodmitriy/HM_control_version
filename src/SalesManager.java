import java.util.stream.LongStream;

    public class SalesManager {
        protected long[] sales;

        public SalesManager(long[] sales) {
            this.sales = sales;
        }

        public long max() {
            long max = -1L;
            long[] var3 = this.sales;
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                long sale = var3[var5];
                if (sale > max) {
                    max = sale;
                }
            }

            return max;
        }

        public long min() {
            long min = 100000L;
            long[] var3 = this.sales;
            int var4 = var3.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                long sale = var3[var5];
                if (sale < min) {
                    min = sale;
                }
            }

            return min;
        }

        public long statistik() {
            long statistik = (LongStream.of(this.sales).sum() - this.max() - this.min()) / (long)(this.sales.length - 2);
            return statistik;
        }
    }

