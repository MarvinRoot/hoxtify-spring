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
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String title;

//    @ManyToMany
//    @JoinTable(name = "playlistSongs", joinColumns = @JoinColumn(name = "playlistId", referencedColumnName = "id"),
//    inverseJoinColumns = @JoinColumn(name="songId", referencedColumnName = "id"))
//    private ArrayList<Song> songs;
//
//    @ManyToOne
//    @JoinColumn(name = "userId", referencedColumnName = "id")
//    private User user;
}
