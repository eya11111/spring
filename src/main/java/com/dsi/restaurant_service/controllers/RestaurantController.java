package com.dsi.restaurant_service.controllers;

import com.dsi.restaurant_service.entity.Adresse;
import com.dsi.restaurant_service.entity.Menu;
import com.dsi.restaurant_service.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public List<Adresse> getRestaurantsbyville(@RequestParam("ville")  String ville) {
        return restaurantService.findAvailableRestaurants(ville);
    }

    @GetMapping("/menus")
    public List<Menu> getMenusbynamemenu(@RequestParam("namemenu")  String namemenu) {
        return restaurantService.findRestaurantMenu(namemenu);
    }
}
