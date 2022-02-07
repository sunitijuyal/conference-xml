package com.learning.service;

import com.learning.model.Speaker;
import com.learning.repository.HibernateSpeakerRepositoryImpl;
import com.learning.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
//    removing the hardcoded object creation below so that I could
//    use the setter or constructor injection

//    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    private SpeakerRepository repository;

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }
//        providing default and one argument constructor to support constructor injection from applicationContext.xml
     public SpeakerServiceImpl(){

     }
//     used for one argument constructor injection
    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }

//    used for setter injection
    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
