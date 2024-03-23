package ru.netology.stats;

public class StatsService {
    public int calculateSumSale(int[] sales) {
        int sum = 0;
        for (int i : sales) {
            sum += i;
        }
        return sum;
    }

    public int averageAmount(int[] sales) {

        return calculateSumSale(sales) / sales.length;
    }


    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int countMonthOfSalesBelowAverage(int[] sales) {

        int count = 0;

        for (long sale : sales) {
            long averageSale = averageAmount(sales);
            if (sale < averageSale) {

                for (int i = 0; i < sales.length; i++) {
                    if (sales[i] <= averageAmount(sales)) {

                        count++;
                    }
                }
                return count;
            }


        }

        public int countMonthOfSalesAboveAverage(int[] sales);

            int count = 0;
                int averageSale = averageAmount(sales);
                if (sales > averageSale) {
                    for (int i = 0; i < sales.length; i++) {
                        if (sales[i] > averageAmount(sales)) {
                            count++;

                        }
                    }
                    return count;
                }
            }