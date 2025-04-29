package com.dsi.restaurant_service;

import com.dsi.restaurant_service.entity.Adresse;
import com.dsi.restaurant_service.entity.Menu;
import com.dsi.restaurant_service.repository.AdresseRepository;
import com.dsi.restaurant_service.repository.MenuRepository;
import com.dsi.restaurant_service.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestaurantServiceApplication implements CommandLineRunner {



    public static void main(String[] args) {
        SpringApplication.run(RestaurantServiceApplication.class, args);
    }

    @Autowired
    RestaurantService restaurantService;

    @Autowired
    private AdresseRepository adresseRepository;

    @Autowired
    private MenuRepository menuRepository;


    @Override
    public void run(String... args) throws Exception {
        /*
        Adresse r1 = new Adresse(5,"abc","rua fath","lo","Marsa");
        Adresse r2 = new Adresse(5,"abc","rua fath","lo","Tunis");
        Menu m1 = new Menu("m1",15,r1);
        Menu m2 = new Menu("m2",10,r1);


        adresseRepository.save(r1);
        adresseRepository.save(r2);
        menuRepository.save(m1);
        menuRepository.save(m2);*/






    }

}
