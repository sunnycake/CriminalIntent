package com.mynuex.criminalintent;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public abstract class SingleFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        // Calling support library
        FragmentManager fm = getSupportFragmentManager();
        // retrieving CrimeFragment from Fragment Manager with container view ID
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = createFragment();
            fm.beginTransaction() // create and commits a fragment transaction
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }
}