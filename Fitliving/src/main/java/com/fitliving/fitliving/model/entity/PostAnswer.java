package com.fitliving.fitliving.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "postAnswer")
public class PostAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "answer", columnDefinition = "TEXT")
    private String answerText;

    @ManyToOne
    private PostQuestion postQuestion;

    @ManyToOne
    private User user;

    public PostAnswer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public PostQuestion getPostQuestion() {
        return postQuestion;
    }

    public void setPostQuestion(PostQuestion postQuestion) {
        this.postQuestion = postQuestion;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
