package com.example.webtest.domain

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@ToString(includeNames = true, includePackage = false)
@EqualsAndHashCode(includes = ['id','name','price'])
class Item {
    Item(Long id, String name, Double price) {
        this.id = id
        this.name = name
        this.price = price
    }
    Long id
    String name
    Double price
}
