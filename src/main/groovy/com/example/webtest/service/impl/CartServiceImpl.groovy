package com.example.webtest.service.impl

import com.example.webtest.domain.Item
import com.example.webtest.service.CartService
import groovy.util.logging.Slf4j
import org.springframework.stereotype.Service

import javax.annotation.PostConstruct

@Service
@Slf4j
class CartServiceImpl implements CartService {
    Map<Item, Integer> cart = new HashMap<>()

    @PostConstruct
    void addDefaultItems(){
        Item tea = new Item(1L,'tea',12.2)
        Item milk = new Item(1L,'milk',22.2)
        Item coffee = new Item(1L,'coffee',42.2)
        Item horlicks = new Item(1L,'horlicks',52.2)
        cart[tea] = 50
        cart[milk] = 50
        cart[horlicks] = 25
        cart[coffee] = 30
        log.warn('###### default items added. Now the cart has: '+cart)
    }

    @Override
    void addItem(Item item) {
        cart[item] = 1
    }

    @Override
    void addItems(Item item, Integer quantity) {
        cart[item] = cart[item] ? cart[item] + quantity : quantity
    }

    @Override
    Set<Item> getItem(String itemName) {
        cart.keySet().findAll { it.name == itemName }
    }

    @Override
    Map<Item, Integer>  getAllItems() {
        cart
    }

    @Override
    void updateItem(Item item) {

    }

    @Override
    void removeItem(Item item) {
        cart.remove(item)
    }

}
