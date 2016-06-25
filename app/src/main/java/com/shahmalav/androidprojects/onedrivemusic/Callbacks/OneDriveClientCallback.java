package com.shahmalav.androidprojects.onedrivemusic.Callbacks;

import android.util.Log;

import com.onedrive.sdk.concurrency.ICallback;
import com.onedrive.sdk.core.ClientException;
import com.onedrive.sdk.extensions.IOneDriveClient;
import com.onedrive.sdk.extensions.OneDriveClient;

/**
 * Created by shahm on 6/25/2016.
 */
public class OneDriveClientCallback implements ICallback<IOneDriveClient> {
    private IOneDriveClient oneDriveClient;


    @Override
    public void success(IOneDriveClient oneDriveClient) {
        this.oneDriveClient = oneDriveClient;
    }

    @Override
    public void failure(ClientException ex) {
        Log.e("odcCallbackFailure",ex.getMessage());
    }

    public IOneDriveClient getOneDriveClient(){
        return this.oneDriveClient;
    }
}
