package mk.ukim.finki.mk.lab.service;

import mk.ukim.finki.mk.lab.model.Artist;

import java.util.List;
import java.util.Optional;

public interface ArtistService {
    List<Artist> listArtists();
    Optional<Artist> findById(Long id);
}
