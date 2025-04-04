package com.fahitahmed.baruchclub.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.fahitahmed.baruchclub.entities.Club;
import com.fahitahmed.baruchclub.service.ClubService;

@RestController
@RequestMapping("/api/clubs")
public class ClubController {
    
    @Autowired
    ClubService clubService;
    
    @GetMapping
    public ResponseEntity<List<Club>> getAllClubs() {
        return ResponseEntity.ok(clubService.getAllClubs());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Club> getClubById(@PathVariable int id) {
        return ResponseEntity.ok(clubService.getClubById(id));
    }
    
    @PostMapping
    public ResponseEntity<Club> saveClub(@RequestBody Club club) {
        return ResponseEntity.ok(clubService.saveClub(club));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Club> updateClub(@PathVariable int id, @RequestBody Club club) {
        club.setClubId(id);
        return ResponseEntity.ok(clubService.updateClub(club));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClub(@PathVariable int id) {
        Club club = clubService.getClubById(id);
        clubService.deleteClub(club);
        return ResponseEntity.ok().build();
    }
} 