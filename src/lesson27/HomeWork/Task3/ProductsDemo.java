package HomeWork.Task3;

import java.util.*;

public class ProductsDemo {
    public static void main(String[] args) {

       List<Product>Catalog = new ArrayList<>();
       Catalog.add(new Product("butter", 15.5));
       Catalog.add(new Product("milk", 10.0));
       Catalog.add(new Product("meat", 17.4));
       Catalog.add(new Product("beer", 5.5));
       Catalog.add(new Product("bread", 2.8));
       Catalog.add(new Product("flour", 9.7));

       Set<Product>MyCatalog = new TreeSet<>(Catalog);
       System.out.println(MyCatalog);

       MyCatalog.remove(new Product("butter",15.5));
       System.out.println(MyCatalog);

       System.out.println("Searching product is available " + MyCatalog.contains(new Product("bread", 2.8)));















    }
}
