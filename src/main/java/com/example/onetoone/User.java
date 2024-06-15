package com.example.onetoone;


import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long Id;
    private String name;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private AadharCard aadharCard;
}
