package org.slackyogi.data;

import org.slackyogi.model.Drink;
import org.slackyogi.model.Food;
import org.slackyogi.model.Product;

import java.util.TreeSet;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductRepository {

    private static TreeSet<Product> products = new TreeSet<>(); // TODO move database out of memory

    private static TreeSet<Product> getProducts() {             //TODO do not allow access to products
        return products;
    }

    public ProductRepository() {
        products = fetchDataFromFakeDB();
    }

    public void addProduct(Product product) {
        // products.add(product);                               // TODO implement this
    }

    public Product findByName(String name) {
        return new Food("aaa", 0, 0);                            // TODO implement this
    }

    public Iterable<Product> findAll() {
        return getProducts();
    }

    public Long count() {
        return Long.valueOf(1);                                     // TODO implement this
    }

    public void delete(Product product) {
                                                                    // TODO implement this
    }

    public boolean exists(UUID primaryKey) {
        return true;                                                // TODO implement this
    }

    private static TreeSet<Product> fetchDataFromFakeDB() {
        Stream<Product> products = Stream.of(new Food("Banana", 2.0, 0.5),
                (new Food("Flour",1.0,1.0)),
        (new Food("Coffee",12.5,0.7)),
        (new Food("Egg",0.2,0.1)),
        (new Food("Tomato",1.6,0.2)),
        (new Food("Cookies",5.1,0.8)),
        (new Drink("Milk",1.1,1.0)),
        (new Drink("Coola",2.0,3.3)));
        return products.collect(Collectors.toCollection(TreeSet::new));

    }
}
