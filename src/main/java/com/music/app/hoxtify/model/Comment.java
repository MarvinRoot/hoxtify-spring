package com.music.app.hoxtify.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String content;

//    @ManyToOne
//    @JoinColumn(name = "userId", referencedColumnName = "id")
////    @Transient
//    private User user;

//    @ManyToOne
//    @JoinColumn(name = "songId", referencedColumnName = "id")
//    private Song song;
}
