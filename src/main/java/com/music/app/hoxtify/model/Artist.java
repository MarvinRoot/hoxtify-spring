package com.music.app.hoxtify.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Setter
@Getter
@ToString
@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String image;

//    @ManyToOne
//    @JoinColumn(name="genreId", referencedColumnName = "id", nullable = false)
//    private Genre genre;
//
//    @ManyToMany(mappedBy = "favoriteArtists")
//    private ArrayList<User> users;
//
//    @ManyToMany
//    @JoinTable(name = "artistSongs", joinColumns = @JoinColumn(name = "artistId", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name="songId", referencedColumnName = "id"))
//    private ArrayList<Song> artistSongs;

}
