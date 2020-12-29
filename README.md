# TextInputLayoutProgrammatically
 bsa untuk view yang lain jga

- `temp_layout.xml`
```xml
<?xml version="1.0" encoding="utf-8"?>
<com.google.android.material.textfield.TextInputLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/text_input_layout"
    style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_margin="10dp">

    <com.google.android.material.textfield.TextInputEditText
        android:id="@+id/text_input_edit_text"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter User Name" />
</com.google.android.material.textfield.TextInputLayout>
```

- `main_activity.xml`
```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <LinearLayout
        android:id="@+id/ln"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:text="Hello World!"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

- `MainActivity.java`
```java
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout ln = findViewById(R.id.ln);
        View v = LayoutInflater.from(this).inflate(R.layout.temp_layout, null);

        TextInputLayout textInputLayout = v.findViewById(R.id.text_input_layout);
        TextInputEditText textInputEditText = v.findViewById(R.id.text_input_edit_text);
        textInputLayout.setHint("Please Enter User Name");
        textInputEditText.setText("Text Here");
        ln.addView(v);
    }
}
```

---

```
Copyright 2020 M. Fadli Zein
```