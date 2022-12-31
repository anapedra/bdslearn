package com.anapazsantanas.dslearnnbds.resources.exception;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class OAuthCustomError implements Serializable {
    private static final long serialVersionUID=1L;
    private String error;
    @JsonProperty("errord_escription")     //Para usarmos no formato do java(errord_escription)
    private String errorDescription;


    public OAuthCustomError() {

    }
    public OAuthCustomError(String error, String errorDescription) {
        super();
        this.error = error;
        this.errorDescription = errorDescription;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
