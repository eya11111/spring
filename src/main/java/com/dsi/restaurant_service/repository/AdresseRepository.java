package com.dsi.restaurant_service.repository;

import com.dsi.restaurant_service.entity.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdresseRepository extends JpaRepository<Adresse, Integer> {

    List<Adresse> findByVilleIgnoreCase(String ville);
}
