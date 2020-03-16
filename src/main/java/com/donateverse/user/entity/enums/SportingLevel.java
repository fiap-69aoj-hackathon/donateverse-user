package com.donateverse.user.entity.enums;

/**
 * @author flaoliveira
 * @version : $<br/>
 * : $
 * @since 10/11/2019 14:42
 */
public enum SportingLevel {
    AMATEUR("Amador"),
    PROFESSIONAL("Profissional"),
    COACH("Treinador");

    private final String description;

    SportingLevel(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}