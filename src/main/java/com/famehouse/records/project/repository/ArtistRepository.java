package com.famehouse.records.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.famehouse.records.project.model.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Long> {

}
