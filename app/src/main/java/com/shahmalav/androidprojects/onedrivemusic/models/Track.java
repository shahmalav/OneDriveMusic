package com.shahmalav.androidprojects.onedrivemusic.models;

/**
 * Created by shahm on 6/24/2016.
 */
public class Track {
    public String uniqueId;
    public String titleTrack;
    public String subTitle;
    public String description;
    public String imagePath;
    public String content;

    public Track(String uniqueId, String titleTrack, String subTitle, String description, String imagePath, String content){
        this.uniqueId = uniqueId;
        this.titleTrack = titleTrack;
        this.subTitle = subTitle;
        this.description = description;
        this.imagePath = imagePath;
        this.content = content;
    }

}
