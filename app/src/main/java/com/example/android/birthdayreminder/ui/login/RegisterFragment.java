package com.example.android.birthdayreminder.ui.login;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.birthdayreminder.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment implements View.OnClickListener {
EditText usernameEditText,passwordEditText,confirmPasswordEdiText;
    Button registerButton;
    TextView textLogin;


    public RegisterFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_register,container,false);

        usernameEditText=(EditText)view.findViewById(R.id.login_edit_text);
        passwordEditText=(EditText)view.findViewById(R.id.password_edit_text_register);
        confirmPasswordEdiText=(EditText)view.findViewById(R.id.confirm_password);

        registerButton=(Button)view.findViewById(R.id.register_button);
        textLogin=(TextView)view.findViewById(R.id.goback_text_view);
        registerButton.setOnClickListener(this);
        textLogin.setOnClickListener(this);

        usernameEditText.setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.goback_text_view){
            LoginActivity loginActivity = (LoginActivity) getActivity();
            loginActivity.goBackButtonClicked();
        }
    }

    public void onBackPressed(){
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.popBackStack(fragmentManager.getBackStackEntryAt(0).getId(), FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }
}
