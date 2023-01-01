package com.anapazsantanas.dslearnnbds.dto;

import com.anapazsantanas.dslearnnbds.entities.Deliver;
import com.anapazsantanas.dslearnnbds.entities.enums.DeliverStatus;

import java.io.Serializable;

public class DeliverRevisionDTO implements Serializable {
   private static final long serialVersionUID=1L;

    private DeliverStatus status;
    private String feedback;
    private Integer correctCount;

    public DeliverRevisionDTO() {

    }

    public DeliverRevisionDTO(DeliverStatus status, String feedback, Integer correctCount) {
        super();
        this.status = status;
        this.feedback = feedback;
        this.correctCount = correctCount;
    }
    public DeliverRevisionDTO(Deliver entiry) {
       status=entiry.getStatus();
       feedback=entiry.getFeedback();
       correctCount=entiry.getCorrectCount();
    }


    public DeliverStatus getStatus() {
        return status;
    }

    public void setStatus(DeliverStatus status) {
        this.status = status;
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
}
