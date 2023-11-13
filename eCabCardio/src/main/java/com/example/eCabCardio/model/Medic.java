package com.example.eCabCardio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "medics")
public class Medic  extends  User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
