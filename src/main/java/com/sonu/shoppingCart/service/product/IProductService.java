package com.sonu.shoppingCart.service.product;

import com.sonu.shoppingCart.model.Product;
import com.sonu.shoppingCart.request.AddProductRequest;
import com.sonu.shoppingCart.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest request);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long productId);

    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);


    List<Product> getProductsByCategoryAndBrand(String category,String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndNmae(String brand,String name);
    Long countProductsByBrandAndName(String brand,String name);

}
