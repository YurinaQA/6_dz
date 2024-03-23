package ru.netology.stats;
public class StatsService {
    public int calculateSumSale(long[] sales) {
        int sum = 0;
        for (long i : sales) {
            sum += i;
        }
        return sum;
    }

    /*
среднюю сумму продаж в месяц
     */
    public int averageAmount(long[] sales) {
        return calculateSumSale(sales) / sales.length;
    }
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int monthMinAverage(long[] sales) {

        int minAverage = 0;
        int average = averageAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= average) {
                minAverage++;
            }
        }
        return minAverage;
    }

    public int monthMaxAverage(long[] sales) {

        int maxAverage = 0;
        int average = averageAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= average) {
                maxAverage++;
            }
        }
        return maxAverage;
    }
}
