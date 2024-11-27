package mk.ukim.finki.mk.lab.service;

import mk.ukim.finki.mk.lab.model.Album;

import java.util.List;
import java.util.Optional;

public interface AlbumService {
    public List<Album> findAll();

    Optional<Album> findById(Long albumId);
}

