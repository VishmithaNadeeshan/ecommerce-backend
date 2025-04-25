package edu.ICET.service;

import edu.ICET.dto.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);
    Product searchProduct(Integer id);
    void updateProduct(Product product);
    void deleteProduct(Integer id);
    List<Product> getAll();


}
