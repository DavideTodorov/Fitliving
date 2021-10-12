package com.fitliving.fitliving.model.entity;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "postQuestion")
public class PostQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "questionName")
    private String questionName;

    @Column(name = "publishedOn")
    private Instant publishedOn;

    @OneToMany(mappedBy = "postQuestion")
    private List<PostAnswer> postAnswers;

    @ManyToOne
    private User user;

    public PostQuestion() {
        this.postAnswers = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public Instant getPublishedOn() {
        return publishedOn;
    }

    public void setPublishedOn(Instant publishedOn) {
        this.publishedOn = publishedOn;
    }

    public List<PostAnswer> getPostAnswers() {
        return postAnswers;
    }

    public void setPostAnswers(List<PostAnswer> postAnswers) {
        this.postAnswers = postAnswers;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
