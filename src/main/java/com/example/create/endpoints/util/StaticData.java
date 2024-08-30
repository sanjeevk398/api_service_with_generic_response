package com.example.create.endpoints.util;

import com.example.create.endpoints.dtos.Customer;
import com.example.create.endpoints.dtos.Product;

import java.util.ArrayList;
import java.util.List;

public class StaticData {

    public List<Customer> getCustomers(){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Amit", 23, "Pune"));
        customers.add(new Customer("Sujit", 21, "Patna"));
        customers.add(new Customer("Ranjit", 42, "Pataya"));
        return  customers;
    }

    public List<Product> getProducts(){
        List<Product> products = new ArrayList<>();
        products.add(new Product("Parle G", 23, "Parle"));
        products.add(new Product("Pixal 7a", 23423, "Google"));
        products.add(new Product("Iphone", 40000, "Apple"));
        return products;
    }
}
