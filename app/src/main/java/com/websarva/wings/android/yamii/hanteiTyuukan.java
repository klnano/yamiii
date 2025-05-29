package com.websarva.wings.android.yamii;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class hanteiTyuukan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hantei_tyuukan);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent intent = getIntent();
        String Score = intent.getStringExtra("Score2");
        TextView tvPoint = findViewById(R.id.tensuu2);
        tvPoint.setText(Score);


    }

    public void nearHospital(View view) throws UnsupportedEncodingException {
        String near = "近くの病院";
        near = URLEncoder.encode(near, "UTF-8");
        String urlStr = "geo:0,0?q=" + near;
        Uri uri = Uri.parse(urlStr);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }

    public void onClickBack(View view){
       finish();

    }
}