package com.dsi.restaurant_service.services;

import com.dsi.restaurant_service.entity.Adresse;
import com.dsi.restaurant_service.entity.Menu;
import com.dsi.restaurant_service.repository.AdresseRepository;
import com.dsi.restaurant_service.repository.MenuRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    private AdresseRepository adresseRepository;

    private MenuRepository menuRepository;

    public RestaurantService(AdresseRepository adresseRepository, MenuRepository menuRepository) {
        this.adresseRepository = adresseRepository;
        this.menuRepository = menuRepository;
    }

    public List<Adresse> findAvailableRestaurants(String ville){
        System.out.println("vvvv"+ville);
        return adresseRepository.findByVilleIgnoreCase(ville);
    }

    public List<Menu> findRestaurantMenu(String menuName){
        System.out.println("vvvv"+menuName);
        return menuRepository.findByNameMenu(menuName);
    }
}
