package com.websarva.wings.android.yamii;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class selectutsu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_selectutsu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        setContentView(R.layout.activity_selectutsu);
        Button hanteiButton = findViewById(R.id.hantei);
        hantei hantei = new hantei();
        hanteiButton.setOnClickListener(hantei);
    }

    public class hantei implements View.OnClickListener{
        @Override
        public void onClick(View view){
            Intent intent = getIntent();
            String ScoreString = intent.getStringExtra("Score1");
            int Score = Integer.valueOf(ScoreString);

            RadioGroup rg11 = (RadioGroup) findViewById(R.id.radio11);
            RadioGroup rg12 = (RadioGroup) findViewById(R.id.radio12);
            RadioGroup rg13 = (RadioGroup) findViewById(R.id.radio13);
            RadioGroup rg14 = (RadioGroup) findViewById(R.id.radio14);
            RadioGroup rg15 = (RadioGroup) findViewById(R.id.radio15);
            RadioGroup rg16 = (RadioGroup) findViewById(R.id.radio16);
            RadioGroup rg17 = (RadioGroup) findViewById(R.id.radio17);
            RadioGroup rg18 = (RadioGroup) findViewById(R.id.radio18);
            RadioGroup rg19 = (RadioGroup) findViewById(R.id.radio19);
            RadioGroup rg20 = (RadioGroup) findViewById(R.id.radio20);

            int id11 = rg11.getCheckedRadioButtonId();
            int id12 = rg12.getCheckedRadioButtonId();
            int id13 = rg13.getCheckedRadioButtonId();
            int id14 = rg14.getCheckedRadioButtonId();
            int id15 = rg15.getCheckedRadioButtonId();
            int id16 = rg16.getCheckedRadioButtonId();
            int id17 = rg17.getCheckedRadioButtonId();
            int id18 = rg18.getCheckedRadioButtonId();
            int id19 = rg19.getCheckedRadioButtonId();
            int id20 = rg20.getCheckedRadioButtonId();

            RadioButton radioButton11 = (RadioButton) findViewById(id11);
            String radio11 = radioButton11.getText().toString();
            RadioButton radioButton12 = (RadioButton) findViewById(id12);
            String radio12 = radioButton12.getText().toString();
            RadioButton radioButton13 = (RadioButton) findViewById(id13);
            String radio13 = radioButton13.getText().toString();
            RadioButton radioButton14 = (RadioButton) findViewById(id14);
            String radio14 = radioButton14.getText().toString();
            RadioButton radioButton15 = (RadioButton) findViewById(id15);
            String radio15 = radioButton15.getText().toString();
            RadioButton radioButton16 = (RadioButton) findViewById(id16);
            String radio16 = radioButton16.getText().toString();
            RadioButton radioButton17 = (RadioButton) findViewById(id17);
            String radio17 = radioButton17.getText().toString();
            RadioButton radioButton18 = (RadioButton) findViewById(id18);
            String radio18 = radioButton18.getText().toString();
            RadioButton radioButton19 = (RadioButton) findViewById(id19);
            String radio19 = radioButton19.getText().toString();
            RadioButton radioButton20 = (RadioButton) findViewById(id20);
            String radio20 = radioButton20.getText().toString();

            String yes = "はい";
            String no = "いいえ";
            if (radio11.equals(yes)){
                Score += 4;
            }
            if (radio12.equals(yes)){
                Score += 6;
            }

            if (radio13.equals(no)){
                Score += 6;
            }

            if (radio14.equals(yes)){
                Score += 6;
            }

            if (radio15.equals(yes)){
                Score +=5;
            }

            if (radio16.equals(yes)){
                Score +=4;
            }

            if (radio17.equals(yes)){
                Score +=4;
            }

            if (radio18.equals(no)){
                Score +=4;
            }

            if (radio19.equals(yes)){
                Score += 5;
            }

            if (radio20.equals(yes)){
                Score += 6;
            }

            if(Score<=30){
                String Score2 = String.valueOf(Score);
                Intent intent2 = new Intent(selectutsu.this, hanteiSaitei.class);
                intent2.putExtra("Score2", Score2);
                startActivity(intent2);
            }else if(Score<=60){
                String Score2 = String.valueOf(Score);
                Intent intent2 = new Intent(selectutsu.this, hanteiTyuukan.class);
                intent2.putExtra("Score2", Score2);
                startActivity(intent2);
            }else{
                String Score2 = String.valueOf(Score);
                Intent intent2 = new Intent(selectutsu.this, hanteiSaikou.class);
                intent2.putExtra("Score2", Score2);
                startActivity(intent2);
            }
        }
    }

    public void onClickClear(View view){
        RadioGroup rg11 = (RadioGroup) findViewById(R.id.radio11);
        RadioGroup rg12 = (RadioGroup) findViewById(R.id.radio12);
        RadioGroup rg13 = (RadioGroup) findViewById(R.id.radio13);
        RadioGroup rg14 = (RadioGroup) findViewById(R.id.radio14);
        RadioGroup rg15 = (RadioGroup) findViewById(R.id.radio15);
        RadioGroup rg16 = (RadioGroup) findViewById(R.id.radio16);
        RadioGroup rg17 = (RadioGroup) findViewById(R.id.radio17);
        RadioGroup rg18 = (RadioGroup) findViewById(R.id.radio18);
        RadioGroup rg19 = (RadioGroup) findViewById(R.id.radio19);
        RadioGroup rg20 = (RadioGroup) findViewById(R.id.radio20);

        int id11 = rg11.getCheckedRadioButtonId();
        int id12 = rg12.getCheckedRadioButtonId();
        int id13 = rg13.getCheckedRadioButtonId();
        int id14 = rg14.getCheckedRadioButtonId();
        int id15 = rg15.getCheckedRadioButtonId();
        int id16 = rg16.getCheckedRadioButtonId();
        int id17 = rg17.getCheckedRadioButtonId();
        int id18 = rg18.getCheckedRadioButtonId();
        int id19 = rg19.getCheckedRadioButtonId();
        int id20 = rg20.getCheckedRadioButtonId();

        RadioButton radioButton11 = (RadioButton) findViewById(id11);
        String radio11 = radioButton11.getText().toString();
        RadioButton radioButton12 = (RadioButton) findViewById(id12);
        String radio12 = radioButton12.getText().toString();
        RadioButton radioButton13 = (RadioButton) findViewById(id13);
        String radio13 = radioButton13.getText().toString();
        RadioButton radioButton14 = (RadioButton) findViewById(id14);
        String radio14 = radioButton14.getText().toString();
        RadioButton radioButton15 = (RadioButton) findViewById(id15);
        String radio15 = radioButton15.getText().toString();
        RadioButton radioButton16 = (RadioButton) findViewById(id16);
        String radio16 = radioButton16.getText().toString();
        RadioButton radioButton17 = (RadioButton) findViewById(id17);
        String radio17 = radioButton17.getText().toString();
        RadioButton radioButton18 = (RadioButton) findViewById(id18);
        String radio18 = radioButton18.getText().toString();
        RadioButton radioButton19 = (RadioButton) findViewById(id19);
        String radio19 = radioButton19.getText().toString();
        RadioButton radioButton20 = (RadioButton) findViewById(id20);
        String radio20 = radioButton20.getText().toString();

        String yes = "はい";

        if (radio11.equals(yes)){
            rg11.check(R.id.radio11n);
        }
        if (radio12.equals(yes)){
            rg12.check(R.id.radio12n);
        }
        if (radio13.equals(yes)){
            rg13.check(R.id.radio13n);
        }
        if (radio14.equals(yes)){
            rg14.check(R.id.radio14n);
        }
        if (radio15.equals(yes)){
            rg15.check(R.id.radio15n);
        }
        if (radio16.equals(yes)){
            rg16.check(R.id.radio16n);
        }
        if (radio17.equals(yes)){
            rg17.check(R.id.radio17n);
        }
        if (radio18.equals(yes)){
            rg18.check(R.id.radio18n);
        }
        if (radio19.equals(yes)){
            rg19.check(R.id.radio19n);
        }
        if (radio20.equals(yes)){
            rg20.check(R.id.radio20n);
        }
    }
    public void onBackButtonClick(View view){
        finish();
    }
}