package com.dsi.restaurant_service.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Adresse {
    @Id
    private int numero;
    private String nom;
    private String rue;
    private  String city;
    private String ville;
    @JsonIgnore
    @OneToMany(mappedBy = "adresse")
    private List<Menu> menuList;


    public Adresse(int numero, String nom, String rue, String city, String ville) {
        this.numero = numero;
        this.nom = nom;
        this.rue = rue;
        this.city = city;
        this.ville = ville;
    }

    public Adresse() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "numero=" + numero +
                ", nom='" + nom + '\'' +
                ", rue='" + rue + '\'' +
                ", city='" + city + '\'' +
                ", ville='" + ville + '\'' +
                ", menuList=" + menuList +
                '}';
    }
}
