package com.shahmalav.androidprojects.onedrivemusic.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shahm on 6/24/2016.
 */
public class Album {
    public String uniqueId;
    public String albumName;
    public String genre;
    public String imagePath;
    public List<Track> tracks;

    public Album(String uniqueId, String albumName, String genre, String imagePath){
        this.uniqueId = uniqueId;
        this.albumName = albumName;
        this.genre = genre;
        this.imagePath = imagePath;
        this.tracks = new ArrayList<Track>();
    }
}
