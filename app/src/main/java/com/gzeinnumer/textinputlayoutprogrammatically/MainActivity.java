package com.gzeinnumer.textinputlayoutprogrammatically;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout rootView = findViewById(R.id.rootView);

        View view = LayoutInflater.from(this).inflate(R.layout.temp_layout, null);
        TextInputLayout userNameIDTextInputLayout=view.findViewById(R.id.userIDTextInputLayout);
        TextInputEditText userNameInputEditText = view.findViewById(R.id.userIDTextInputEditText);
        userNameIDTextInputLayout.setHint("Please Enter User Name");
        userNameInputEditText.setText("Text Here");
        rootView.addView(view);
    }
}