package com.fahitahmed.baruchclub.service;

import java.util.List;
import com.fahitahmed.baruchclub.entities.Club;

public interface ClubService {
    Club saveClub(Club club);
    Club updateClub(Club club);
    void deleteClub(Club club);
    Club getClubById(int id);
    List<Club> getAllClubs();
} 