package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button button;

    private RadioButton radioButton;
    private TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroupId);
        button = findViewById(R.id.buttonId);
        textView = findViewById(R.id.textViewId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int selectedId = radioGroup.getCheckedRadioButtonId();
                    radioButton = findViewById(selectedId);

                    String value = radioButton.getText().toString();
                    textView.setText("selected is "+value);
                } catch (Exception e){
                    Toast.makeText(MainActivity.this, "Please selected items"+e, Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}