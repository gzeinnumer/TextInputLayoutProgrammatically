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

        LinearLayout ln = findViewById(R.id.ln);
        View v = LayoutInflater.from(this).inflate(R.layout.temp_layout, null);
        TextInputLayout textInputLayout =v.findViewById(R.id.text_input_layout);
        TextInputEditText textInputEditText = v.findViewById(R.id.text_input_edit_text);
        textInputLayout.setHint("Please Enter User Name");
        textInputEditText.setText("Text Here");
        ln.addView(v);
    }
}