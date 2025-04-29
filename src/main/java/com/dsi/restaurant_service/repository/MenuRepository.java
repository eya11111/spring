package com.dsi.restaurant_service.repository;

import com.dsi.restaurant_service.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MenuRepository extends JpaRepository<Menu, Long> {

    @Query("select m from Menu m where m.name like %:menuName%")
    List<Menu> findByNameMenu(@Param("menuName") String menuName);

}
