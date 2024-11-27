package mk.ukim.finki.mk.lab.service;

import mk.ukim.finki.mk.lab.model.Album;
import mk.ukim.finki.mk.lab.model.Artist;
import mk.ukim.finki.mk.lab.model.Song;

import java.util.List;
import java.util.Optional;

public interface SongService {
    List<Song> listSongs();
    Artist addArtistToSong(Artist artist, Song song);
    Song findByTrackId(Long trackId);

    public Optional<Song> save(String title, String genre, Integer releaseYear, Album album);

    void deleteById(Long id);
}

