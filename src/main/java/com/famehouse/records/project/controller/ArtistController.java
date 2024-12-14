package com.famehouse.records.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.famehouse.records.project.model.Artist;
import com.famehouse.records.project.service.ArtistService;

import java.util.List;

@RestController
@RequestMapping("/api/artists")
public class ArtistController {
    @Autowired
    private ArtistService artistService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public List<Artist> getArtists() {
        return artistService.getAllArtists();
    }

    @PostMapping
    public Artist createArtist(@RequestBody Artist artist) {
        return artistService.saveArtist(artist);
    }
}
