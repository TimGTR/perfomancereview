package ru.ubrr.pr.heapdump;
import java.util.Arrays;
import java.util.List;

public class HeapDump {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Loading products...");
        List<String> products = new ProductCatalogService().getProducts(1000);
        System.out.println(products.size() + " products are loaded into memory.");
        Thread.sleep(1000 * 1000L);
    }

}
