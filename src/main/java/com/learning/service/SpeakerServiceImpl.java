package com.learning.service;

import com.learning.model.Speaker;
import com.learning.repository.HibernateSpeakerRepositoryImpl;
import com.learning.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
