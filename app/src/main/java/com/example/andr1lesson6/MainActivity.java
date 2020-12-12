package com.example.andr1lesson6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements IFragments {

    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

    }

    @Override
    public void onFirstFragment() {

        transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.fragment_container, ChangeFragment.newInstance("Hello, change first fragment", ""));
        transaction.addToBackStack(null);
        transaction.commit();

    }

    @Override
    public void onSecondFragment() {

        transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.fragment_container, TextFragment.newInstance("Hello, change second fragment", ""));
        transaction.addToBackStack(null);
        transaction.commit();


    }
}