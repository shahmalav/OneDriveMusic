package com.shahmalav.androidprojects.onedrivemusic;

import android.content.Context;
import android.provider.ContactsContract;
import android.util.Log;
import android.widget.Toast;

import com.onedrive.sdk.authentication.ADALAuthenticator;
import com.onedrive.sdk.authentication.MSAAuthenticator;
import com.onedrive.sdk.concurrency.ICallback;
import com.onedrive.sdk.core.ClientException;
import com.onedrive.sdk.core.DefaultClientConfig;
import com.onedrive.sdk.core.IClientConfig;
import com.onedrive.sdk.extensions.IItemCollectionPage;
import com.onedrive.sdk.extensions.IOneDriveClient;
import com.onedrive.sdk.extensions.Item;
import com.onedrive.sdk.extensions.OneDriveClient;

/**
 * Created by shahm on 6/24/2016.
 */
public class DataSource {

    private IOneDriveClient oneDriveClient;

    public DataSource(IOneDriveClient oneDriveClient){
        this.oneDriveClient = oneDriveClient;
    }

    //refactor to asyncTask
    public void getAlbumsData(){

        try {
            IItemCollectionPage folders = oneDriveClient
                    .getDrive()
                    .getSpecial("music")
                    .getChildren()
                    .buildRequest()
                    .expand("thumbnails").get();

            //for (Item item: folders.getCurrentPage()) {
                Log.i("Item data", folders.getCurrentPage().get(0).name );
            //}

        }catch (Exception ex){
            //
        }
    }

}
