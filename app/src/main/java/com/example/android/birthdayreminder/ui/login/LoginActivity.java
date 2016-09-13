package com.example.android.birthdayreminder.ui.login;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.birthdayreminder.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        LoginFragment loginFragment=new LoginFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container,loginFragment).commit();

    }

    public void registerButtonClicked(){
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        RegisterFragment registerFragment=new RegisterFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container,registerFragment).addToBackStack(null).commit();
    }

    public void goBackButtonClicked(){
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        /*RegisterFragment registerFragment=new RegisterFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.login_container,registerFragment).addToBackStack(null).commit();*/
        RegisterFragment registerFragment = (RegisterFragment) fragmentManager.findFragmentById(R.id.container);
        if(registerFragment instanceof RegisterFragment){
            registerFragment.onBackPressed();
        } else {
            super.onBackPressed();
        }
    }
}
