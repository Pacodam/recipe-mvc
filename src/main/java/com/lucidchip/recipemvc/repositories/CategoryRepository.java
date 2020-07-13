package com.lucidchip.recipemvc.repositories;

import com.lucidchip.recipemvc.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
