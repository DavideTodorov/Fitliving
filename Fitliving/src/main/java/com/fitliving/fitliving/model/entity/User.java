package com.fitliving.fitliving.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "users")
    private List<UserRole> userRole;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @ManyToMany(mappedBy = "users")
    private List<TrainingClass> trainingClasses;

    @OneToMany(mappedBy = "user")
    private List<PostQuestion> postQuestions;

    @OneToMany(mappedBy = "user")
    private List<PostAnswer> postAnswers;

    public User() {
        this.userRole = new ArrayList<>();
        this.trainingClasses = new ArrayList<>();
        this.postQuestions = new ArrayList<>();
        this.postAnswers = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<UserRole> getUserRole() {
        return userRole;
    }

    public void setUserRole(List<UserRole> userRole) {
        this.userRole = userRole;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TrainingClass> getTrainingClasses() {
        return trainingClasses;
    }

    public void setTrainingClasses(List<TrainingClass> trainingClasses) {
        this.trainingClasses = trainingClasses;
    }

    public List<PostQuestion> getPostQuestions() {
        return postQuestions;
    }

    public void setPostQuestions(List<PostQuestion> postQuestions) {
        this.postQuestions = postQuestions;
    }

    public List<PostAnswer> getPostAnswers() {
        return postAnswers;
    }

    public void setPostAnswers(List<PostAnswer> postAnswers) {
        this.postAnswers = postAnswers;
    }
}
