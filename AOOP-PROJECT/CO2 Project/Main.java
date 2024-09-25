package salesdata;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<SalesData> salesDataList = Arrays.asList(
                new SalesData("Product A", 100.0),
                new SalesData("Product B", 150.0),
                new SalesData("Product A", 200.0),
                new SalesData("Product C", 300.0),
                new SalesData("Product B", 250.0)
        );

        SalesAnalysis analysis = new SalesAnalysis();

        double totalSales = analysis.calculateTotalSales(salesDataList);
        double averageSales = analysis.calculateTotalSales(salesDataList);
        Map<String, Double> salesByProduct = analysis.calculateSalesByProduct(salesDataList);
        String topSellingProduct = analysis.findTopSellingProduct(salesDataList);

        System.out.println("Total Sales: " + totalSales);
        System.out.println("Average Sales: " + averageSales);
        System.out.println("Sales by Product: " + salesByProduct);
        System.out.println("Top Selling Product: " + topSellingProduct);
    }
}
