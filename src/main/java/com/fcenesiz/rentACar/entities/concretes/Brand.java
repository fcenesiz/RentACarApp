package com.fcenesiz.rentACar.entities.concretes;

import lombok.*;

import javax.persistence.*;

@Table(name = "brands")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;

}
