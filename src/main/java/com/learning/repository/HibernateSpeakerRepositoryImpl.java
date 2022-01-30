package com.learning.repository;

import com.learning.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers =new ArrayList<Speaker>();
        Speaker speaker = new Speaker();

        speaker.setFirstName("Suniti");
        speaker.setLastName("Juyal");

        speakers.add(speaker);

        return speakers;
    }

}
