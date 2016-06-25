package com.shahmalav.androidprojects.onedrivemusic;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.onedrive.sdk.authentication.ADALAuthenticator;
import com.onedrive.sdk.authentication.IAuthenticator;
import com.onedrive.sdk.authentication.MSAAuthenticator;
import com.onedrive.sdk.concurrency.ICallback;
import com.onedrive.sdk.core.ClientException;
import com.onedrive.sdk.core.DefaultClientConfig;
import com.onedrive.sdk.core.IClientConfig;
import com.onedrive.sdk.extensions.Drive;
import com.onedrive.sdk.extensions.IOneDriveClient;
import com.onedrive.sdk.extensions.OneDriveClient;

public class MainActivity extends AppCompatActivity {

    private DataSource dataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataSource = new DataSource(getOneDriveClient());
    }


    public IOneDriveClient getOneDriveClient(){
        final IOneDriveClient[] oneDriveClient = new IOneDriveClient[1];

        new OneDriveClient.Builder()
                .fromConfig(AppConfig.oneDriveConfig).loginAndBuildClient(this, new ICallback<IOneDriveClient>() {
            @Override
            public void success(IOneDriveClient odc) {
                Toast.makeText(MainActivity.this, "oneDriveClient success", Toast.LENGTH_LONG).show();
                oneDriveClient[0] = odc;
            }

            @Override
            public void failure(ClientException ex) {
                Toast.makeText(MainActivity.this, "OneDriveClient failed", Toast.LENGTH_LONG).show();
            }
        });
        return oneDriveClient[0];
    }

}
