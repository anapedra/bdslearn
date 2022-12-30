package com.anapazsantanas.dslearnnbds.entities;

import com.anapazsantanas.dslearnnbds.entities.pk.EnrollmantPK;

import javax.persistence.*;
import java.time.Instant;
import java.util.*;

@Entity
@Table(name = "tb_enrollmant")
public class Enrollment {

    @EmbeddedId
    private EnrollmantPK id =new EnrollmantPK();
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant enrollMoment;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant refundMoment;
    private boolean available;
    private boolean onlyUpdate;
    @ManyToMany(mappedBy ="enrollmentDone" )
    private Set<Lesson>lessonsDone=new HashSet<>();
    @OneToMany(mappedBy ="enrollment" )
    private List<Deliver> delivers=new ArrayList<>();

    public Enrollment() {

    }

    public Enrollment(User user, Offer offer, Instant enrollMoment, Instant refundMoment, boolean available, boolean onlyUpdate) {
        id.setUser(user);
        id.setOffer(offer);
        this.enrollMoment = enrollMoment;
        this.refundMoment = refundMoment;
        this.available = available;
        this.onlyUpdate = onlyUpdate;
    }

   public User getStudent(){
        return id.getUser();
   }
   public void setStent(User user){
        id.setUser(user);
   }

    public Set<Lesson> getLessonsDone() {
        return lessonsDone;
    }

    public List<Deliver> getDelivers() {
        return delivers;
    }

    public Offer getOffer(){
        return id.getOffer();
    }
    public void setOffer(Offer offer){
        id.setOffer(offer);
    }


    public Instant getEnrollMoment() {
        return enrollMoment;
    }

    public void setEnrollMoment(Instant enrollMoment) {
        this.enrollMoment = enrollMoment;
    }

    public Instant getRefundMoment() {
        return refundMoment;
    }

    public void setRefundMoment(Instant refundMoment) {
        this.refundMoment = refundMoment;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isOnlyUpdate() {
        return onlyUpdate;
    }

    public void setOnlyUpdate(boolean onlyUpdate) {
        this.onlyUpdate = onlyUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Enrollment)) return false;
        Enrollment that = (Enrollment) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
