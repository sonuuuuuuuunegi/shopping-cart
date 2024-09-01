package com.sonu.shoppingCart.repository;

import com.sonu.shoppingCart.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findByName(String name);
}
