package com.example.gticslab5.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "technician")
public class Technician {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TechnicianID")
    private int technicianId;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastname;
    @Column(name = "Dni")
    private String dni;
    @Column(name = "Phone")
    private String phone;
    @Column(name = "Age")
    private int age;







}
