package com.online.shopping.itemDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.shopping.item.model.ItemBO;

public interface ItemJPARespository extends JpaRepository<ItemBO, Long>{
	public ItemBO findByitemName(String nnn);
}
