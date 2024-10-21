package com.isys221.favoritefood;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //  Joseph Marvin
    //  ISYS 221 - VL1
    //  Individual Programming Assignment #4 - Favorite Food App (Fragments)
    //  Due: 10/20/2024

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Load MainFragment into container
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new MainFragment())
                    .commit();
        }
    }
}
