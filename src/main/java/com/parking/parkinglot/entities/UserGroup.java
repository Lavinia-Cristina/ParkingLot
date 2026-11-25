package com.parking.parkinglot.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "user_group")
public class UserGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String username;
    private String userGroup;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}