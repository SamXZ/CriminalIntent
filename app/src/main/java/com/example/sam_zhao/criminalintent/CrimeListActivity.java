package com.example.sam_zhao.criminalintent;

import android.support.v4.app.Fragment;

public class CrimeListActivity extends SIngleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
