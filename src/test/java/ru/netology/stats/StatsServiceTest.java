package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class StatsServiceTest {

    @Test
    public void SumOfAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.calculateSumSale(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void AverageAmountSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAver = 15;
        int actualAver = service.averageAmount(sales);
        Assertions.assertEquals(expectedAver, actualAver);
    }
    @Test
    public void numberMonthMaxSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumMax = 8;
        int actualNumMax = service.maxSales(sales);
        Assertions.assertEquals(expectedNumMax, actualNumMax);
    }
    @Test
    public void numberMonthMinSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumMin = 9;
        int actualNumMin = service.minSales(sales);
        Assertions.assertEquals(expectedNumMin, actualNumMin);
    }
    @Test
    public void LessAverageSale() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedLessAver = 7;
        int actualLessAver = service.monthMinAverage(sales);

        Assertions.assertEquals(expectedLessAver, actualLessAver);
    }
    @Test
    public void MoreAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMoreAver = 7;
        int actualMoreAver = service.monthMaxAverage(sales);

        Assertions.assertEquals(expectedMoreAver, actualMoreAver);
    }
}
