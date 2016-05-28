package com.asynchrony.hud.map.spike;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.asynchrony.hud.map.spike.gridlayout.GridLayoutFragment;
import com.asynchrony.hud.map.spike.gridlayoutspike.R;
import com.asynchrony.hud.map.spike.gridview.GridViewFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
//                           .add(R.id.view_container, new GridLayoutFragment())
                           .add(R.id.view_container, new GridViewFragment())
                           .commit();
        }
    }
}
