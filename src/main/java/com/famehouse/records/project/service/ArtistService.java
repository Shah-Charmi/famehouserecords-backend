package com.famehouse.records.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.famehouse.records.project.model.Artist;
import com.famehouse.records.project.repository.ArtistRepository;

@Service
public class ArtistService {
    @Autowired
    private ArtistRepository artistRepository;

    public Artist saveArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }
}
