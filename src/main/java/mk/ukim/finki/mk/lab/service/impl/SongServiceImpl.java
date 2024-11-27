package mk.ukim.finki.mk.lab.service.impl;

import mk.ukim.finki.mk.lab.model.Album;
import mk.ukim.finki.mk.lab.model.Artist;
import mk.ukim.finki.mk.lab.model.Song;
import mk.ukim.finki.mk.lab.repository.ArtistRepository;
import mk.ukim.finki.mk.lab.repository.SongRepository;
import mk.ukim.finki.mk.lab.service.SongService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongServiceImpl implements SongService {
    private final SongRepository songRepository;
    private final ArtistRepository artistRepository;

    public SongServiceImpl(SongRepository songRepository, ArtistRepository artistRepository) {
        this.songRepository = songRepository;
        this.artistRepository = artistRepository;
    }

    @Override
    public List<Song> listSongs() {
        return songRepository.findAll();
    }

    @Override
    public Artist addArtistToSong(Artist artist, Song song) {
        return songRepository.addArtistToSong(artist, song);
    }

    @Override
    public Song findByTrackId(Long trackId) {
        return songRepository.findByTrackId(trackId);
    }

    @Override
    public Optional<Song> save(String title, String genre, Integer releaseYear, Album album) {
        return songRepository.save(title, genre, releaseYear, album);
    }

    @Override
    public void deleteById(Long id) {
        this.songRepository.deleteById(id);
    }
}
