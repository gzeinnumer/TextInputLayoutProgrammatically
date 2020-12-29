package com.gzeinnumer.textinputlayoutprogrammatically;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = findViewById(R.id.ln);
        final View[] views = new View[2];
        for (int i = 0; i < 2; i++) {
            views[i] = LayoutInflater.from(this).inflate(R.layout.temp_layout, null);
            TextInputLayout textInputLayout = views[i].findViewById(R.id.text_input_layout);
            TextInputEditText textInputEditText = views[i].findViewById(R.id.text_input_edit_text);
            textInputLayout.setHint("Please Enter User Name");
            textInputEditText.setText("Text Here");
            linearLayout.addView(views[i]);
        }
    }
}