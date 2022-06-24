package com.example.k3vo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.ui.AppBarConfiguration;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    //TextView tv_nama;
    //String st_nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        //tv_nama = findViewById(R.id.nama);

        //st_nama = getIntent().getExtras().getString("nama");
        //tv_nama.setText("Hi, " + st_nama + "!");

        BottomNavigationView bnv = findViewById(R.id.bottomNavigationView);
        bnv.setOnNavigationItemSelectedListener(navListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.fragment_menu_a:
                            selectedFragment = new MenuA();
                            break;
                        case R.id.fragment_menu_b:
                            selectedFragment = new MenuB();
                            break;
                        case R.id.fragment_menu_c:
                            selectedFragment = new MenuC();
                            break;
                        case R.id.fragment_menu_d:
                            selectedFragment = new MenuD();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,
                            selectedFragment).commit();

                    return true;
                }
            };
}