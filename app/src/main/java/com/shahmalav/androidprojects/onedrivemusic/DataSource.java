package com.shahmalav.androidprojects.onedrivemusic;

import com.onedrive.sdk.extensions.IItemCollectionPage;
import com.onedrive.sdk.extensions.IOneDriveClient;
import com.onedrive.sdk.extensions.Item;
import com.shahmalav.androidprojects.onedrivemusic.models.Album;
import com.shahmalav.androidprojects.onedrivemusic.models.Track;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shahm on 6/24/2016.
 */
public class DataSource {

    private List<Album> albumList;

    public DataSource() {
        albumList = new ArrayList<Album>();
    }

    //refactor to asyncTask
    public List<Album> getAlbumsData() {

        String imageUrl = "";


        //uniqueId, String albumName, String genre, String imagePath
        //albumList.add(new Album("1","Bollywood Album","Pop Rock", ""));

        Album albumOne = new Album("1","Bollywood Album","Pop Rock", "ImageURL1");
        Album albumTwo = new Album("2","Crawford Album","Pop Rock", "ImageURL2");
        Album albumThree = new Album("3","Hollywood Album","Pop Rock", "ImageURL3");
        Album albumFour = new Album("4","Saawan Album","Pop Rock", "ImageURL4");

        //    String uniqueId, String title, String albumName, String genre, String imagePath

        Track trackOne = new Track("1","Track 1", "Bollywood Album", "Pop Rock", "ImageURL1");
        Track trackTwo = new Track("2","Track 2", "Bollywood Album", "Pop Rock", "ImageURL1");

        albumOne.tracks.add(trackOne);
        albumOne.tracks.add(trackTwo);

        albumTwo.tracks.add(trackOne);
        albumTwo.tracks.add(trackTwo);

        albumThree.tracks.add(trackOne);
        albumThree.tracks.add(trackTwo);

        albumFour.tracks.add(trackOne);
        albumFour.tracks.add(trackTwo);

        albumList.add(albumOne);
        albumList.add(albumTwo);
        albumList.add(albumThree);
        albumList.add(albumFour);

           /* oneDriveClient
                    .getDrive()
                    .getSpecial("music")
                    .getChildren()
                    .buildRequest()
                    .expand("thumbnails").get(albumCallback);*/
/*

            IItemCollectionPage albums = oneDriveClient
                    .getDrive()
                    .getSpecial("music")
                    .getChildren()
                    .buildRequest()
                    .expand("thumbnails")
                    .get();

            for (Item itemAlbum : albums.getCurrentPage()) {

                IItemCollectionPage tracks = oneDriveClient
                        .getDrive()
                        .getItems(itemAlbum.id)
                        .getChildren()
                        .buildRequest()
                        .expand("thumbnails")
                        .get();

                try {
                    if (tracks.getCurrentPage().size() > 0)
                        imageUrl = tracks.getCurrentPage().get(0).thumbnails.getCurrentPage().get(0).large.url;
                    else
                        imageUrl = "";
                } catch (Exception ex) {
                    imageUrl = "";
                }

                Album album = new Album(itemAlbum.id,
                        tracks.getCurrentPage().size() > 0 ? tracks.getCurrentPage().get(0).audio.album : itemAlbum.name,
                        tracks.getCurrentPage().size() > 0 ? tracks.getCurrentPage().get(0).audio.genre : "",
                        imageUrl,
                        ""
                );

                for (Item itemTrack : tracks.getCurrentPage()) {

                    try {
                        album.tracks.add(new Track(
                                itemTrack.id,
                                itemTrack.audio.title,
                                itemTrack.audio.genre,
                                "",
                                itemTrack.thumbnails.getCurrentPage().get(0).large.url,
                                itemTrack.webUrl));

                    } catch (IllegalArgumentException AOOREX) {
                        //
                    } catch (Exception ex) {
                        //
                    }
                }
                this.albumList.add(album);
            }
*/

        return albumList;
    }

}
