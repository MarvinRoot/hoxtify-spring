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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(unique = true, columnDefinition = "varchar(255)")
    private String username;

    @NotBlank
    @Column(unique = true)
    private String email;

    @NotBlank
    @Column
    private String password;

    @Column
    private String profileImg;

//    @OneToMany(mappedBy = "Playlist")
//    private ArrayList<Playlist> playlists;
//
//    @ManyToMany
//    @JoinTable(name = "favoriteSongs", joinColumns = @JoinColumn(name = "userId", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name="songId", referencedColumnName = "id"))
//    private ArrayList<Song> favoriteSongs;
//
//    @ManyToMany
//    @JoinTable(name = "favoriteGenres", joinColumns = @JoinColumn(name = "userId", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name="genreId", referencedColumnName = "id"))
//    private ArrayList<Genre> favoriteGenres;
//
//    @ManyToMany
//    @JoinTable(name = "favoriteArtists", joinColumns = @JoinColumn(name = "userId", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name="artistId", referencedColumnName = "id"))
//    private ArrayList<Artist> favoriteArtists;
//
//    @OneToMany(mappedBy = "Comment")
//    private ArrayList<Comment> userComments;
}
