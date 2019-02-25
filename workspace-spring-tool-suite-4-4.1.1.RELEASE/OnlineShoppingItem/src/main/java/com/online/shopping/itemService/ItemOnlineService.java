package com.online.shopping.itemService;

import java.util.List;

import com.online.shopping.item.dto.ItemDto;



public interface ItemOnlineService {
	 public List<ItemDto> getItemDetails();
	 public ItemDto getItemDetail(String itemName);
	 public void updateItemDetail(String itemName);
	 public void addItemDetail();
	 public void removeItem(String itemName);
}
