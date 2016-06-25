package com.shahmalav.androidprojects.onedrivemusic.models;

/**
 * Created by shahm on 6/24/2016.
 */
public class Track {
    public String uniqueId;
    public String title;
    public String albumName;
    public String genre;
    public String imagePath;

    public Track(String uniqueId, String title, String albumName, String genre, String imagePath){
        this.uniqueId = uniqueId;
        this.title= title;
        this.albumName = albumName;
        this.genre = genre;
        this.imagePath = imagePath;
    }

}
