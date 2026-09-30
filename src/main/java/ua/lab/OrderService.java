package ua.lab;

import java.util.List;

public class OrderService {

    public double calculateTotal(List<Product> products, double discount) {
        double total = products.stream()
                .mapToDouble(product -> product.getPrice() * product.getQuantity())
                .sum();
        double totalWithDiscount = total - total * discount;
        return totalWithDiscount;
    }

    public double averagePrice(List<Product> products) {
        if (products == null || products.isEmpty()) {
            return 0.0;
        }
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum() / products.size();
    }
}
