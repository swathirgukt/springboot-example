package com.example.webtest.service

import com.example.webtest.domain.Item

interface CartService {
    void addItem(Item item)

    void addItems(Item item, Integer quantity)

    Set<Item> getItem(String item)

    Map<Item, Integer> getAllItems()

    void updateItem(Item item)

    void removeItem(Item item)
}