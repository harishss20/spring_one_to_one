package com.example.onetoone;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="aadhar")
public class AadharCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
private long ID;
private long number;
}
