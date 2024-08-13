package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;


@Entity
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique=true, nullable=false)
    private String login;
    @Column(unique=true, nullable=false)
    private String password;
    private LocalDate localDate;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    private List <Smartphone> smartphones;

    @OneToOne (cascade = CascadeType.PERSIST)
    private Diary diary;


    public User(String login, String password, LocalDate localDate) {
        this.login = login;
        this.password = password;
        this.localDate = localDate;
    }
}
