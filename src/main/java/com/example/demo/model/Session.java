package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Session {
    @Id
    private String sessionId;
    public Session() {
    }
    public Session(String sessionId) {
        this.sessionId = sessionId;
    }

}
