package com.pmanaktala.collegeinfo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table(name = "pmanaktala_college_info")
@Entity
@Getter
@Setter
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;

    private Long numberOfLORs;
    private String otherNotes;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-YYYY")
    private Date applicationStartDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-YYYY")
    private Date applicationEndDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    private Toefl toefl;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    private Gre gre;

}
