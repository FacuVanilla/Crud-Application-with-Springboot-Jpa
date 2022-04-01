package com.seun.thursday2.service;

import com.seun.thursday2.entity.Buddy;
import com.seun.thursday2.repository.BuddyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuddyService {

    @Autowired
    private BuddyRepository buddyRepository;

    public List<Buddy> getBuddys(){
        return buddyRepository.findAll();
    }

    public void  addBuddy(Buddy buddy){
        buddyRepository.save(buddy);
    }

    public void updateBuddy(Buddy buddy){
        buddyRepository.save(buddy);
    }

    public void deleteBuddy(Integer id){
        buddyRepository.deleteById(id);
    }
}
