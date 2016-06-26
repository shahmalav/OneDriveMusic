package com.shahmalav.androidprojects.onedrivemusic.Callbacks;

import android.util.Log;

import com.onedrive.sdk.concurrency.ICallback;
import com.onedrive.sdk.core.ClientException;
import com.onedrive.sdk.extensions.IOneDriveClient;
import com.onedrive.sdk.extensions.OneDriveClient;
import com.shahmalav.androidprojects.onedrivemusic.DataSource;

/**
 * Created by shahm on 6/25/2016.
 */
public class OneDriveClientCallback implements ICallback<IOneDriveClient> {
    public static IOneDriveClient oneDriveClient;
    private DataSource dataSource;


    @Override
    public void success(IOneDriveClient oneDriveClient) {
        this.oneDriveClient = oneDriveClient;
        dataSource = new DataSource();
    //    dataSource.getAlbumsData(this.oneDriveClient);

    }

    @Override
    public void failure(ClientException ex) {
        Log.e("odcCallbackFailure",ex.getMessage());
    }


}
