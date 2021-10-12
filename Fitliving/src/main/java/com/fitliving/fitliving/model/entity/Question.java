package com.fitliving.fitliving.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "questionTitle")
    private String questionTitle;

    @Column(name = "questionText", columnDefinition = "TEXT")
    private String questionText;

    @OneToOne
    private User userAsked;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public User getUserAsked() {
        return userAsked;
    }

    public void setUserAsked(User userAsked) {
        this.userAsked = userAsked;
    }
}
