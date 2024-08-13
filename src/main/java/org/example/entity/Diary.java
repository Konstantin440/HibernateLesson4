package org.example.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Diary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int classNumber;
    private int schoolNumber;
    private int grade;



    public Diary(int classNumber, int schoolNumber, int grade) {
        this.classNumber = classNumber;
        this.schoolNumber = schoolNumber;
        this.grade = grade;
    }
}



