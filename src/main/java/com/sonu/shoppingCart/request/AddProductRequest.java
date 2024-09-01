package com.sonu.shoppingCart.request;

import com.sonu.shoppingCart.model.Category;
import lombok.Data;


import java.math.BigDecimal;

@Data
public class AddProductRequest {
    private Long id;

    private  String name;

    private String brand;

    private BigDecimal price;

    private int inventary;

    private String description;



    private Category category;

}
