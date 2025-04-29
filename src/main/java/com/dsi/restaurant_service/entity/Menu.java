package com.dsi.restaurant_service.entity;

import jakarta.persistence.*;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private float prix;
    @ManyToOne
    @JoinColumn(name="numRestaurant")
    private Adresse adresse;


    public Menu(String name, float prix, Adresse adresse) {
        this.name = name;
        this.prix = prix;
        this.adresse = adresse;
    }

    public Menu() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prix=" + prix +
                ", adresse=" + adresse +
                '}';
    }
}
