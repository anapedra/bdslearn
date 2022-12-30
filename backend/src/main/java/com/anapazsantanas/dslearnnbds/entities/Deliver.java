package com.anapazsantanas.dslearnnbds.entities;

import com.anapazsantanas.dslearnnbds.entities.enums.DeliverStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_deliver")
public class Deliver implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uri;
    private Instant moment;
    private DeliverStatus statos;
    private String feedback;
    private Integer correctCount;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "offer_id"),
            @JoinColumn(name = "user_id")
    })
    private Enrollment enrollment;
    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;


    public Deliver() {

    }

    public Deliver(Long id, String uri, Instant moment, String feedback,DeliverStatus statos, Integer correctCount, Enrollment enrollment, Lesson lesson) {
        super();
        this.id = id;
        this.uri = uri;
        this.moment = moment;
        this.feedback = feedback;
        this.statos=statos;
        this.correctCount = correctCount;
        this.enrollment = enrollment;
        this.lesson = lesson;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Integer getCorrectCount() {
        return correctCount;
    }

    public void setCorrectCount(Integer correctCount) {
        this.correctCount = correctCount;
    }

    public Enrollment getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public DeliverStatus getStatos() {
        return statos;
    }

    public void setStatos(DeliverStatus statos) {
        this.statos = statos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Deliver)) return false;
        Deliver deliver = (Deliver) o;
        return Objects.equals(getId(), deliver.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
