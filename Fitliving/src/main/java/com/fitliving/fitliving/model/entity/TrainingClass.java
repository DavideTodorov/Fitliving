package com.fitliving.fitliving.model.entity;


import com.fitliving.fitliving.model.enums.TrainingClassTypeEnum;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "trainingClass")
public class TrainingClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "classType")
    private TrainingClassTypeEnum classType;

    @Column(name = "bookedOn")
    private Instant bookedOn;

    @ManyToMany
    private List<User> users;

    public TrainingClass() {
        this.users = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TrainingClassTypeEnum getClassType() {
        return classType;
    }

    public void setClassType(TrainingClassTypeEnum classType) {
        this.classType = classType;
    }

    public Instant getBookedOn() {
        return bookedOn;
    }

    public void setBookedOn(Instant bookedOn) {
        this.bookedOn = bookedOn;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
