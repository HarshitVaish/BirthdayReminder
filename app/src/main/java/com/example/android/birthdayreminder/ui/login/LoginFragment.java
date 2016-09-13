package com.example.android.birthdayreminder.ui.login;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.birthdayreminder.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment implements View.OnClickListener {
    EditText usernameEditText, passwordEditText;
    Button loginButton;
    TextView registerTextView;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        usernameEditText = (EditText) view.findViewById(R.id.username_edit_text);
        passwordEditText = (EditText) view.findViewById(R.id.password_edit_text);
        loginButton = (Button) view.findViewById(R.id.login_button);
        registerTextView = (TextView) view.findViewById(R.id.register_text_view);

        registerTextView.setOnClickListener(this);
        loginButton.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View view) {
        LoginActivity activity = (LoginActivity) getActivity();

        if (view.getId() == R.id.login_button) {
            String Username = usernameEditText.getText().toString();
            String password = passwordEditText.getText().toString();
            if (Username.isEmpty() || password.isEmpty()) {
                Toast.makeText(getActivity(), "All Fields Are Mandatory", Toast.LENGTH_SHORT).show();
            }
        }
        if (view.getId() == R.id.register_text_view) {
            activity.registerButtonClicked();
        }
    }
}
