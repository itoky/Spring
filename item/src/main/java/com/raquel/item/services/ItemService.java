package com.raquel.item.services;

import java.util.List;

import com.raquel.item.entity.Item;

public interface ItemService {
	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
}
