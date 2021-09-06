package com.pmanaktala.collegeinfo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "pmanaktala_gre")
@Entity
@Getter
@Setter
public class Gre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "college_id")
    @JsonBackReference
    private College college;

    private Boolean required;
    private Long verbalScore;
    private Long quantsScore;
    private Long totalScore;
    private Long awaScore;
}
