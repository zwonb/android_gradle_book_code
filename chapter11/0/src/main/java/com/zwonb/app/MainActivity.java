package com.zwonb.app;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

/**
 * @author zwonb
 * @date 2020-01-06
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(this, BuildConfig.FLURRY_KEY, Toast.LENGTH_SHORT).show();
    }
}
