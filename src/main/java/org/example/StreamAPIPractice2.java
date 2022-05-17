package org.example;

import lombok.*;


import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
class Customer {

    @Getter @Setter private Long id;
    @Getter @Setter private String name;
    @Getter @Setter private Integer tier;

}
@Data
 class Order {

     @Getter @Setter private Long id;
     @Getter @Setter private LocalDate orderDate;
     @Getter @Setter private LocalDate deliveryDate;
     @Getter @Setter private String status;
     @Getter @Setter private Customer customer;
    @ToString.Exclude
    @Getter @Setter Set<Product> products;
}
@Data
 class Product {

     @Getter @Setter private Long id;
     @Getter @Setter private String name;
     @Getter @Setter private String category;
     @Getter @Setter private Double price;
    @ToString.Exclude
    private Set<Order> orders;
}


public class StreamAPIPractice2 {

    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.setId(1L);
        customer1.setName("Sushant");
        customer1.setTier(1);

        Customer customer2 = new Customer();
        customer2.setId(2L);
        customer2.setName("Rishabh");
        customer2.setTier(2);

        Customer customer3 = new Customer();
        customer3.setId(3L);
        customer3.setName("Saurabh");
        customer3.setTier(3);

        Product product1 = new Product();
        product1.setId(1L);
        product1.setName("Baby Tshirt");
        product1.setCategory("Baby");
        product1.setPrice(100.00);

        Product product4 = new Product();
        product4.setId(4L);
        product4.setName("Baby bathing kit");
        product4.setCategory("Baby");
        product4.setPrice(500.00);

        Product product5 = new Product();
        product5.setId(5L);
        product5.setName("Baby food");
        product5.setCategory("Baby");
        product5.setPrice(700.00);

        Product product2 = new Product();
        product2.setId(2L);
        product2.setName("Toy Train");
        product2.setCategory("Toy");
        product2.setPrice(200.00);

        Product product6 = new Product();
        product6.setId(6L);
        product6.setName("Football");
        product6.setCategory("Toy");
        product6.setPrice(300.00);

        Product product7 = new Product();
        product7.setId(7L);
        product7.setName("Cricket Bat");
        product7.setCategory("Toy");
        product7.setPrice(400.00);

        Product product3 = new Product();
        product3.setId(3L);
        product3.setName("Nursary Rhymes");
        product3.setCategory("Books");
        product3.setPrice(30.00);

        Product product8 = new Product();
        product8.setId(8L);
        product8.setName("Java8 in Action");
        product8.setCategory("Books");
        product8.setPrice(500.00);

        Product product9 = new Product();
        product9.setId(9L);
        product9.setName("Bhagvat Geeta");
        product9.setCategory("Books");
        product9.setPrice(900.00);


        Set<Product> productset1 = new HashSet<>();
        productset1.add(product1);
        productset1.add(product2);
        productset1.add(product3);

        Set<Product> productset2 = new HashSet<>();
        productset2.add(product4);
        productset2.add(product6);
        productset2.add(product8);

        Set<Product> productset3 = new HashSet<>();
        productset3.add(product5);
        productset3.add(product7);
        productset3.add(product9);

        Set<Product> productInventory = new HashSet<>();
        productInventory.add(product1);
        productInventory.add(product2);
        productInventory.add(product3);
        productInventory.add(product4);
        productInventory.add(product5);
        productInventory.add(product6);
        productInventory.add(product7);
        productInventory.add(product8);
        productInventory.add(product9);


        Order order1 = new Order();
        order1.setId(100L);
        order1.setOrderDate(LocalDate.of(2022,05,15));
        order1.setDeliveryDate(LocalDate.of(2022,05,20));
        order1.setStatus("Delivered");
        order1.setCustomer(customer1);
        order1.setProducts(productset1);

        Order order2 = new Order();
        order2.setId(200L);
        order2.setOrderDate(LocalDate.of(2022,04,15));
        order2.setDeliveryDate(LocalDate.of(2022,04,20));
        order2.setStatus("Delivered");
        order2.setCustomer(customer2);
        order2.setProducts(productset2);

        Order order3 = new Order();
        order3.setId(300L);
        order3.setOrderDate(LocalDate.of(2022,03,15));
        order3.setDeliveryDate(LocalDate.of(2022,03,20));
        order3.setStatus("Delivered");
        order3.setCustomer(customer3);
        order3.setProducts(productset3);

        Set<Order> orderInventory = new HashSet<>();
        orderInventory.add(order1);
        orderInventory.add(order2);
        orderInventory.add(order3);

        //Obtain a list of products belongs to category “Books” with price > 100
        List<Product> booksWithPrice100orLess = productInventory.stream().filter(product -> product.getCategory().equals("Books")).filter(product -> product.getPrice() < 100).collect(Collectors.toList());
        System.out.println(booksWithPrice100orLess);

        //Obtain a list of order with products belong to category “Baby”
        List<Order> ordersWithProductBaby = orderInventory.stream().filter(order -> order.getProducts().stream().anyMatch(product -> product.getCategory().equals("Baby"))).collect(Collectors.toList());
        System.out.println(ordersWithProductBaby);

        //Obtain a list of product with category = “Toys” and then apply 10% discount
        List<Product> productWithToyDiscount = productInventory.stream().filter(product -> product.getCategory().equals("Toy")).collect(Collectors.toList());
        productWithToyDiscount.stream().forEach(product -> product.setPrice(product.getPrice()*0.9));
        System.out.println(productWithToyDiscount);

        //Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021
        List<Order> productOrderedByTire2 = orderInventory.stream().filter(order -> order.getCustomer().getTier() == 2 && order.getOrderDate().isBefore(LocalDate.of(2022,04,20)) && order.getOrderDate().isAfter(LocalDate.of(2022,04,01))).collect(Collectors.toList());
        List<Set<Product>> productset =  productOrderedByTire2.stream().map(order -> order.getProducts()).collect(Collectors.toList());
        System.out.println(productset);

        //Get the cheapest products of “Books” category
        Optional<Product> cheapestProduct =  productInventory.stream().min(Comparator.comparing(Product::getPrice));
        System.out.println(cheapestProduct);

        //Get the 3 most recent placed order
        Set<Order> recentmostOrders = orderInventory.stream().sorted(Comparator.comparing(Order::getOrderDate).reversed()).limit(3).collect(Collectors.toSet());
        System.out.println("Last 3 orders : "+recentmostOrders);

        //Get a list of orders which were ordered on 15-Mar-2021, log the order records to the console and then return its product list
        List<Set<Product>> orderon15May = orderInventory.stream().filter(order -> order.getOrderDate().equals(LocalDate.of(2022,05,15))).peek(System.out::println).map(order -> order.getProducts()).collect(Collectors.toList());
        System.out.println(orderon15May);

        //Calculate total lump sum of all orders placed in Feb 2021
        Double orderInMay = orderInventory.stream().filter(order -> order.getOrderDate().getMonthValue() == 05).collect(Collectors.toList())
                .stream().map(order -> order.getProducts()).collect(Collectors.toList())
                .stream().map(products -> products.stream().map(product -> product.getPrice()).mapToDouble(Double::doubleValue).sum())
                .mapToDouble(Double::doubleValue).sum();
        System.out.println(orderInMay);

    }

}
