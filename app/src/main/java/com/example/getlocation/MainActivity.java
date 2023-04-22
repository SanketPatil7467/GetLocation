package com.example.getlocation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView latitude;
    private TextView longitude;
    private Button get_location;
    private Button open_map;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        latitude =findViewById(R.id.textView);
        longitude = findViewById(R.id.textView3);
        get_location = findViewById(R.id.button);
        open_map = findViewById(R.id.button2);

        get_location.setOnClickListener(new View.OnClickListener() {
            @Override
//            18.605365151937633, 73.78202868015218
            public void onClick(View view) {
                latitude.setText("Latitude : 18.605365151937633");
                longitude.setText("Longitude : 73.78202868015218");
            }
        });

        open_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo:18.605365151937633,73.78202868015218"));
                startActivity(i);
            }
        });

    }
}