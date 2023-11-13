package com.example.eCabCardio.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
    private File file;

    private LocalDate birthday;
    private String patient_number;
    private String firstname;
    private String lastname;
    private String country;
    private String city;
    private String address;
    private String occupation;
    private String job;
    private String phone;
    private String email;
    private String cnp;
    private String marital_status;

}
