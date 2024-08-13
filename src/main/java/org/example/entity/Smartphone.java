package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Smartphone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String number;
    private String model;
    private int price;

    @ManyToOne (cascade = CascadeType.PERSIST)
    @JoinColumn (name = "user_id")
    private User user;

    public Smartphone(String number, String model, int price) {
        this.number = number;
        this.model = model;
        this.price = price;
    }
}
