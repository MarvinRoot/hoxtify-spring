package com.music.app.hoxtify.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Setter
@Getter
@ToString
@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "varchar(255) default 'John Snow'")
    @NotBlank
    private String title;

//    @ManyToOne
//    @JoinColumn(name="genreId", referencedColumnName = "id", nullable = false)
//    private Genre genre;

    @Column
    private String src;

    @Column
    private String image;

//    @ManyToMany(mappedBy = "playlistSongs")
//    private ArrayList<Playlist> playlistSongs;
//
//    @ManyToMany(mappedBy = "artistSongs")
//    private ArrayList<Artist> artists;
//
//    @ManyToMany(mappedBy = "favoriteSongs")
//    private ArrayList<User> users;
//
//    @OneToMany(mappedBy = "Comment")
//    private ArrayList<Comment> comments;
}
