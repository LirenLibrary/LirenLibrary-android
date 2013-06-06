package com.thoughtworks;

import android.os.Bundle;
import com.actionbarsherlock.app.SherlockFragmentActivity;

public class HomeActivity extends SherlockFragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }
}

