package com.example.eCabCardio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "consults")
public class Consult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "appointment_id")
    private Appointment appointment;

    private String personal_physiological_antecedents;
    private String personal_pathological_antecedents;
    private String hereditary_collateral_antecedents;
    private String environmental_conditions;
    private String current_status;
    private String circulatory_system;
    private String local_complementary_examinations;
    private String personal_history;
    private String reasons_consultation;
    private String observations;
    private String diagnosis;
    private String other_recommendations;
    private String treatment;

    @ManyToMany
    @JoinTable(
            name = "consult_examination",
            joinColumns = @JoinColumn(name = "consult_id"),
            inverseJoinColumns = @JoinColumn(name = "examination_id")
    )
    private Set<Examination> examinations = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "consult_recommendation",
            joinColumns = @JoinColumn(name = "consult_id"),
            inverseJoinColumns = @JoinColumn(name = "recommendation_id")
    )
    private Set<Recommendation> recommendations = new HashSet<>();

}
