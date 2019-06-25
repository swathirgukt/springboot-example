package com.example.webtest.controller


import com.example.webtest.domain.Item
import com.example.webtest.service.CartService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody

import java.text.SimpleDateFormat

@Controller
class HomeController {

    @Autowired
    CartService cartService

    @ResponseBody
    @GetMapping('/timestamp/{date_string}')
    Date convert(@PathVariable('date_string') String date) {
        def s = new SimpleDateFormat("DD-mm-YYYY")
        s.parse(date)
    }

    @ResponseBody
    @GetMapping('/')
    Map<Item,Integer> home(){
        cartService.getAllItems()
    }

    @ResponseBody
    @PostMapping('/addItem')
    String addItem(@RequestBody Item item){
        cartService.addItem(item)
        "Added in the cart: "+item
    }

}

