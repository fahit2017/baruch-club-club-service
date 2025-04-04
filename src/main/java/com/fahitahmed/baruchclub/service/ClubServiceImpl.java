package com.fahitahmed.baruchclub.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fahitahmed.baruchclub.entities.Club;
import com.fahitahmed.baruchclub.repos.ClubRepository;

@Service
public class ClubServiceImpl implements ClubService {

    @Autowired
    private ClubRepository clubRepository;

    @Override
    public Club saveClub(Club club) {
        return clubRepository.save(club);
    }

    @Override
    public Club updateClub(Club club) {
        return clubRepository.save(club);
    }

    @Override
    public void deleteClub(Club club) {
        clubRepository.delete(club);
    }

    @Override
    public Club getClubById(int id) {
        return clubRepository.findById(id).get();
    }

    @Override
    public List<Club> getAllClubs() {
        return clubRepository.findAll();
    }
} 