package com.shahmalav.androidprojects.onedrivemusic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.onedrive.sdk.extensions.OneDriveClient;
import com.shahmalav.androidprojects.onedrivemusic.models.Album;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shahm on 6/24/2016.
 */
public class AlbumsFragment extends Fragment{

    private DataSource dataSource;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.albums_view_fragment,container,false);

        dataSource = new DataSource();
        List<Album> albumList = dataSource.getAlbumsData();

        ArrayAdapter adapter = new AlbumAdapter(this.getActivity(),albumList); //ArrayAdapter<Album>(this.getActivity(), R.layout.album_list_view_item,albumList);
        ListView listView = (ListView) view.findViewById(R.id.album_list_view);
        listView.setAdapter(adapter);

        return view;
    }

}
