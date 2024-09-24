package salesdata;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalesAnalysis {

    public double calculateTotalSales(List<SalesData> salesDataList) {
        return salesDataList.stream()
                .mapToDouble(SalesData::getAmount)
                .sum();
    }

    public double calculateAverageSales(List<SalesData> salesDataList) {
        return salesDataList.stream()
                .mapToDouble(SalesData::getAmount)
                .average()
                .orElse(0.0);
    }

    public Map<String, Double> calculateSalesByProduct(List<SalesData> salesDataList) {
        return salesDataList.stream()
                .collect(Collectors.groupingBy(SalesData::getProduct,
                        Collectors.summingDouble(SalesData::getAmount)));
    }

    public String findTopSellingProduct(List<SalesData> salesDataList) {
        return salesDataList.stream()
                .collect(Collectors.groupingBy(SalesData::getProduct,
                        Collectors.summingDouble(SalesData::getAmount)))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No sales data available");
    }
}
