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
import com.shahmalav.androidprojects.onedrivemusic.Callbacks.OneDriveClientCallback;

public class MainActivity extends AppCompatActivity {

    private DataSource dataSource;
    OneDriveClientCallback oneDriveClientCallback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oneDriveClientCallback = new OneDriveClientCallback();
        authenticateOneDrive();
    }


    public void authenticateOneDrive(){
        new OneDriveClient.Builder()
                .fromConfig(AppConfig.oneDriveConfig).loginAndBuildClient(this, oneDriveClientCallback);
    }

}
