package com.e.onlineshoppingstore.fragments;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.e.onlineshoppingstore.R;

import static android.content.Context.MODE_PRIVATE;

/**
 * A simple {@link Fragment} subclass.
 */
public class Signup extends Fragment implements View.OnClickListener{

    private EditText etRegisterUN, etRegisterPW, etRegisterConPW;
    private Button btnRegister;


    public Signup() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_signup, container, false);

        etRegisterUN=view.findViewById(R.id.etRegisterUN);
        etRegisterPW=view.findViewById(R.id.etRegisterPW);
        etRegisterConPW=view.findViewById(R.id.etRegisterConPW);
        btnRegister=view.findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        SignUp();
    }
    private void SignUp(){

        SharedPreferences sharedPreferences=getActivity().getSharedPreferences("User", MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("username",etRegisterUN.getText().toString());
        editor.putString("password",etRegisterPW.getText().toString());
        editor.putString("password",etRegisterConPW.getText().toString());

        editor.commit();
        Toast.makeText(getActivity(),"Successfully Registered", Toast.LENGTH_SHORT).show();
    }
}
