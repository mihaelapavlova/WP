package mk.ukim.finki.mk.lab.repository;

import mk.ukim.finki.mk.lab.bootstrap.DataHolder;
import mk.ukim.finki.mk.lab.model.Album;
import mk.ukim.finki.mk.lab.model.Artist;
import mk.ukim.finki.mk.lab.model.Song;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class AlbumRepository {


    public List<Album> findAll(){
        return DataHolder.albums;
    }

    public Optional<Album> findAlbumById(Long albumId) {
        return DataHolder.albums.stream().filter(a -> a.getId().equals(albumId)).findFirst();
    }
}
