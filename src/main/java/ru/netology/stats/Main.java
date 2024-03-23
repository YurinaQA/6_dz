import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println(service.calculateSumSale(sales));
        System.out.println(service.averageAmount(sales));
        System.out.println(service.maxSales(sales));
        System.out.println(service.minSales(sales));
        System.out.println(service.countMonthOfSalesBelowAverage(sales));
        System.out.println(service.countMonthOfSalesAboveAverage(sales));

    }
}