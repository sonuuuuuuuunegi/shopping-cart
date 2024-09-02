package com.sonu.shoppingCart.repository;

import com.sonu.shoppingCart.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image,Long> {
}
