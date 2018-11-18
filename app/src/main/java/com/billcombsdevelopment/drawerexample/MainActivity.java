/*
 * Copyright (c) 2018 - Bill Combs
 */

package com.billcombsdevelopment.drawerexample;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                // Set it to persist highlight
                menuItem.setChecked(true);

                // Close the drawer when item is tapped
                mDrawerLayout.closeDrawers();

                String toastMessage = menuItem.getTitle() + " clicked!";

                Toast.makeText(MainActivity.this, toastMessage, Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }
}
