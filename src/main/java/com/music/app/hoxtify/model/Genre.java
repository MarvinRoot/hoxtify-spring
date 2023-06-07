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
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String image;

//    @OneToMany(mappedBy = "Song")
//    private ArrayList<Song> genreSongs;
//
//    @OneToMany(mappedBy = "Artist")
//    private ArrayList<Artist> genreArtists;
//
//    @ManyToMany(mappedBy = "favoriteGenres")
//    private ArrayList<User> users;


//    @Transient
//    private ArrayList<Artist> artists;
}
