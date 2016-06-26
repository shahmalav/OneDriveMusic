package com.shahmalav.androidprojects.onedrivemusic;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.shahmalav.androidprojects.onedrivemusic.models.Album;

import java.util.List;

/**
 * Created by shahm on 6/26/2016.
 */
public class AlbumAdapter extends ArrayAdapter<Album> {

    private List<Album> albumList;

    public AlbumAdapter(Context context, List<Album> albumList ){
        super(context, R.layout.album_list_view_item, albumList);
        this.albumList = albumList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Album currentAlbum = albumList.get(position);
/*

        ImageView albumImageView = (ImageView) convertView.findViewById(R.id.image_path);
        albumImageView.setImageResource(R.drawable.ic_add_a_photo_black_24dp);

        TextView titleTextView = (TextView) convertView.findViewById(R.id.album_title);
        titleTextView.setText(currentAlbum.albumName);

        TextView genreTextView = (TextView) convertView.findViewById(R.id.album_genre);
        genreTextView.setText(currentAlbum.genre);

        TextView tracksTextView = (TextView) convertView.findViewById(R.id.album_tracks);
        tracksTextView.setText(currentAlbum.tracks.size() + " Tracks");

*/

        //super.getView(position, convertView, parent);
        return  null;
    }
}
