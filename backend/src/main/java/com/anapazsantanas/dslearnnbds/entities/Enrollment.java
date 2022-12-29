package com.anapazsantanas.dslearnnbds.entities;

import com.anapazsantanas.dslearnnbds.entities.pk.EnrollmantPK;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;
@Entity
@Table(name = "tb_enrollmant")
public class Enrollment {

    @EmbeddedId
    private EnrollmantPK id =new EnrollmantPK();
    private Instant enrollMoment;
    private Instant refundMoment;
    private boolean available;
    private boolean onlyUpdate;

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
}
