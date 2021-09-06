package com.pmanaktala.collegeinfo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "pmanaktala_toefl")
@Entity
@Getter
@Setter
public class Toefl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "college_id")
    @JsonBackReference
    private College college;

    private Boolean required;
    private Long minimumReading;
    private Long minimumWriting;
    private Long minimumListening;
    private Long minimumSpeaking;

}
