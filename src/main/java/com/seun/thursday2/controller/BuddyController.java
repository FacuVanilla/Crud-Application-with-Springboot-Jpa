package com.seun.thursday2.controller;

import com.seun.thursday2.entity.Buddy;
import com.seun.thursday2.service.BuddyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
public class BuddyController {

    @Autowired
    private BuddyService buddyService;

    @GetMapping("/buddys")
    public List<Buddy> getBuddys(){
        return buddyService.getBuddys();
    }

    @PostMapping("/buddys/addnew")
    public void addBuddy(@RequestBody Buddy buddy){
        buddyService.addBuddy(buddy);
    }

    @PutMapping("/buddys/{id}/edit")
    public void updateBuddy(@PathVariable("id") Integer id, @RequestBody Buddy buddy){
        buddyService.updateBuddy(buddy);
    }

    @DeleteMapping("/buddys/{id}/delete")
    public void deleteBuddy(@PathVariable("id") Integer id){
        buddyService.deleteBuddy(id);
    }

}
