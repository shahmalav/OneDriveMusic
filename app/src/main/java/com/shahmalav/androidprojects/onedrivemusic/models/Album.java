package com.shahmalav.androidprojects.onedrivemusic.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shahm on 6/24/2016.
 */
public class Album {
    public String uniqueId;
    public String titleAlbum;
    public String subTitle;
    public String description;
    public String imagePath;
    public List<Track> tracks;

    public Album(String uniqueId, String titleAlbum, String subTitle, String description, String imagePath){
        this.uniqueId = uniqueId;
        this.titleAlbum = titleAlbum;
        this.subTitle = subTitle;
        this.description = description;
        this.imagePath = imagePath;
        this.tracks = new ArrayList<Track>();
    }
}
