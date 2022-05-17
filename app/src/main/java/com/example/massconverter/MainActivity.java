package com.example.massconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Widgets
        EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);



        //2 - Convert Kg to pounds
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1 - Getting Kilogram value from editText
                String kilograms = editText.getText().toString();
                //3 -convert kilograms string to float/int
                float kilos = Float.parseFloat(kilograms);
                // 4 -formula 1pound is 2.2kg
                float pounds = (float)(kilos * 2.20462);
                //5 -Set the texView with the result - Displaying the result
                textView1.setText(""+pounds);
                textView2.setText("lbs");
            }
        });

        //Convert G to kg
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String grams = editText.getText().toString();
                float gram = Float.parseFloat(grams);
                float kg = (float)(gram/1000.00);
                textView1.setText(""+ kg);
                textView2.setText("Kg");

            }
        });


    }





}