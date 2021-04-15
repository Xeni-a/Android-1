package com.geekbrains.androidlevel1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private ImageView imageView;
    private Button button;
    private EditText editText;
    private CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setNewText();
        changeTextColor();
        setHurtToImageView();
        setAndroidToImageView();
        setOnBtnClickListener();
        setCheckboxBehavior();
    }

    private void setCheckboxBehavior() {
        boolean isChecked = checkBox.isChecked();
        checkBox.setOnCheckedChangeListener((buttonView, isChecked1) -> {
            //...
        });
    }

    private void setOnBtnClickListener() {
        button.setOnClickListener(v -> {
            String string = editText.getText().toString();
        textView.setText(string);
        });
    }

    private void setAndroidToImageView() {
        imageView.setImageResource(R.drawable.ic_android_black_24dp);
    }

    private void setHurtToImageView() {
        imageView.setImageResource(R.drawable.ic_baseline_favorite_24);

    }
//
    private void initViews() {
        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button_1);
        editText = findViewById(R.id.editText);
        checkBox = findViewById(R.id.checkbox);
    }
    private void setNewText(){
        String appNameStr = getString(R.string.app_name);
        textView.setText(R.string.hello_Android);
    }
    private void changeTextColor() {
        int colorRes = R.color.purple_200;
        int color  = ContextCompat.getColor(getApplicationContext(), colorRes);
        textView.setTextColor(color);
    }
}