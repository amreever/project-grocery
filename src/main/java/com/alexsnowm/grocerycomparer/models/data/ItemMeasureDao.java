package com.alexsnowm.grocerycomparer.models.data;

import com.alexsnowm.grocerycomparer.models.Item;
import com.alexsnowm.grocerycomparer.models.ItemMeasure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ItemMeasureDao extends CrudRepository<ItemMeasure, Integer> {
}
