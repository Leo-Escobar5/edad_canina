package com.example.hellowworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ageEdit = findViewById(R.id.age_edit);
        TextView resultText = findViewById(R.id.result_text);
        Button button = findViewById(R.id.button);

        Log.i("MainActivity","Activity created");

        button.setOnClickListener(v -> {
            String age = ageEdit.getText().toString();
            if (!age.isEmpty()) {
                int ageInt = Integer.parseInt(age);
            int result = ageInt * 7;
            String resultString = getString(R.string.result_format,result);
            resultText.setText(resultString);
            } else{
                Log.e("MainActivity","Age field is empty");
                Toast.makeText(this,getString(R.string.you_have_to_insert_an_age),Toast.LENGTH_SHORT).show();
            }
        });

    }
}