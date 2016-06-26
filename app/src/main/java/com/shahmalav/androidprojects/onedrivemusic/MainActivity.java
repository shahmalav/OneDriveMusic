package com.shahmalav.androidprojects.onedrivemusic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.onedrive.sdk.extensions.OneDriveClient;
import com.shahmalav.androidprojects.onedrivemusic.Callbacks.OneDriveClientCallback;

public class MainActivity extends AppCompatActivity {

    OneDriveClientCallback oneDriveClientCallback;
    private DataSource dataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

      //  oneDriveClientCallback = new OneDriveClientCallback();
    //    authenticateOneDrive();

    }


    public void authenticateOneDrive() {
        new OneDriveClient.Builder()
                .fromConfig(AppConfig.oneDriveConfig).loginAndBuildClient(this, oneDriveClientCallback);
    }

}
