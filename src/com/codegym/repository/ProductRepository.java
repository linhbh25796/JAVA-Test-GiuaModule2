package com.codegym.repository;

import com.codegym.model.Product;

public interface ProductRepository extends GeneralRepository<Product> {
    void add(Product product);

    Product findById(int id);

    void edit(int id, Product product);

    void remove(int id);

    Product search(String name);

    void sortDescending();

    void sortAscending();
}
