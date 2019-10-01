package com.mynuex.criminalintent;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_fragment);
//        // Calling support library
//        FragmentManager fm = getSupportFragmentManager();
//        // retrieving CrimeFragment from Fragment Manager with container view ID
//        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
//
//        if (fragment == null) {
//            fragment = new CrimeFragment();
//            fm.beginTransaction() // create and commits a fragment transaction
//                    .add(R.id.fragment_container, fragment)
//                    .commit();
//        }
    }
}
