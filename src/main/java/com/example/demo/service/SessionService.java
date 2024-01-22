package com.example.demo.service;

import com.example.demo.model.Session;
import com.example.demo.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SessionService {
    @Autowired
    private SessionRepository sessionRepository;
    public Optional<Session> getSessionById(String sessionId) {
        return sessionRepository.findById(sessionId);
    }
    public Session createSession(Session session) {
        return sessionRepository.save(session);
    }
}
