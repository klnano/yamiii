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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });



        setContentView(R.layout.activity_main);
        Button next = findViewById(R.id.next1);
        nextPage1 nextPage1 = new nextPage1();
        next.setOnClickListener(nextPage1);



    }

    public class  nextPage1 implements View.OnClickListener{
        @Override
        public void onClick(View view){
            int Score = 0;
            RadioGroup rg1 = (RadioGroup) findViewById(R.id.radio1);
            RadioGroup rg2 = (RadioGroup) findViewById(R.id.radio2);
            RadioGroup rg3 = (RadioGroup) findViewById(R.id.radio3);
            RadioGroup rg4 = (RadioGroup) findViewById(R.id.radio4);
            RadioGroup rg5 = (RadioGroup) findViewById(R.id.radio5);
            RadioGroup rg6 = (RadioGroup) findViewById(R.id.radio6);
            RadioGroup rg7 = (RadioGroup) findViewById(R.id.radio7);
            RadioGroup rg8 = (RadioGroup) findViewById(R.id.radio8);
            RadioGroup rg9 = (RadioGroup) findViewById(R.id.radio9);
            RadioGroup rg10 = (RadioGroup) findViewById(R.id.radio10);

            int id1 = rg1.getCheckedRadioButtonId();
            int id2 = rg2.getCheckedRadioButtonId();
            int id3 = rg3.getCheckedRadioButtonId();
            int id4 = rg4.getCheckedRadioButtonId();
            int id5 = rg5.getCheckedRadioButtonId();
            int id6 = rg6.getCheckedRadioButtonId();
            int id7 = rg7.getCheckedRadioButtonId();
            int id8 = rg8.getCheckedRadioButtonId();
            int id9 = rg9.getCheckedRadioButtonId();
            int id10 = rg10.getCheckedRadioButtonId();

            RadioButton radioButton1 = (RadioButton) findViewById(id1);
            String radio1 = radioButton1.getText().toString();
            RadioButton radioButton2 = (RadioButton) findViewById(id2);
            String radio2 = radioButton2.getText().toString();
            RadioButton radioButton3 = (RadioButton) findViewById(id3);
            String radio3 = radioButton3.getText().toString();
            RadioButton radioButton4 = (RadioButton) findViewById(id4);
            String radio4 = radioButton4.getText().toString();
            RadioButton radioButton5 = (RadioButton) findViewById(id5);
            String radio5 = radioButton5.getText().toString();
            RadioButton radioButton6 = (RadioButton) findViewById(id6);
            String radio6 = radioButton6.getText().toString();
            RadioButton radioButton7 = (RadioButton) findViewById(id7);
            String radio7 = radioButton7.getText().toString();
            RadioButton radioButton8 = (RadioButton) findViewById(id8);
            String radio8 = radioButton8.getText().toString();
            RadioButton radioButton9 = (RadioButton) findViewById(id9);
            String radio9 = radioButton9.getText().toString();
            RadioButton radioButton10 = (RadioButton) findViewById(id10);
            String radio10 = radioButton10.getText().toString();

            String yes = "はい";
            String no = "いいえ";
            if (radio1.equals(no)){
                Score += 5;
            }
            if (radio2.equals(yes)){
                Score += 5;
            }

            if (radio3.equals(yes)){
                Score += 6;
            }

            if (radio4.equals(yes)){
                Score += 6;
            }

            if (radio5.equals(no)){
                Score +=5;
            }

            if (radio6.equals(yes)){
                Score +=4;
            }

            if (radio7.equals(yes)){
                Score +=4;
            }

            if (radio8.equals(yes)){
                Score +=4;
            }

            if (radio9.equals(yes)){
                Score += 5;
            }

            if (radio10.equals(yes)){
                Score += 6;
            }

            String Score1= String.valueOf(Score);

            Intent intent = new Intent(MainActivity.this, selectutsu.class);

            intent.putExtra("Score1",Score1);

            startActivity(intent);
        }
    }



    public void onClickClear(View view){
        RadioGroup rg1 = (RadioGroup) findViewById(R.id.radio1);
        RadioGroup rg2 = (RadioGroup) findViewById(R.id.radio2);
        RadioGroup rg3 = (RadioGroup) findViewById(R.id.radio3);
        RadioGroup rg4 = (RadioGroup) findViewById(R.id.radio4);
        RadioGroup rg5 = (RadioGroup) findViewById(R.id.radio5);
        RadioGroup rg6 = (RadioGroup) findViewById(R.id.radio6);
        RadioGroup rg7 = (RadioGroup) findViewById(R.id.radio7);
        RadioGroup rg8 = (RadioGroup) findViewById(R.id.radio8);
        RadioGroup rg9 = (RadioGroup) findViewById(R.id.radio9);
        RadioGroup rg10 = (RadioGroup) findViewById(R.id.radio10);

        int id1 = rg1.getCheckedRadioButtonId();
        int id2 = rg2.getCheckedRadioButtonId();
        int id3 = rg3.getCheckedRadioButtonId();
        int id4 = rg4.getCheckedRadioButtonId();
        int id5 = rg5.getCheckedRadioButtonId();
        int id6 = rg6.getCheckedRadioButtonId();
        int id7 = rg7.getCheckedRadioButtonId();
        int id8 = rg8.getCheckedRadioButtonId();
        int id9 = rg9.getCheckedRadioButtonId();
        int id10 = rg10.getCheckedRadioButtonId();

        RadioButton radioButton1 = (RadioButton) findViewById(id1);
        String radio1 = radioButton1.getText().toString();
        RadioButton radioButton2 = (RadioButton) findViewById(id2);
        String radio2 = radioButton2.getText().toString();
        RadioButton radioButton3 = (RadioButton) findViewById(id3);
        String radio3 = radioButton3.getText().toString();
        RadioButton radioButton4 = (RadioButton) findViewById(id4);
        String radio4 = radioButton4.getText().toString();
        RadioButton radioButton5 = (RadioButton) findViewById(id5);
        String radio5 = radioButton5.getText().toString();
        RadioButton radioButton6 = (RadioButton) findViewById(id6);
        String radio6 = radioButton6.getText().toString();
        RadioButton radioButton7 = (RadioButton) findViewById(id7);
        String radio7 = radioButton7.getText().toString();
        RadioButton radioButton8 = (RadioButton) findViewById(id8);
        String radio8 = radioButton8.getText().toString();
        RadioButton radioButton9 = (RadioButton) findViewById(id9);
        String radio9 = radioButton9.getText().toString();
        RadioButton radioButton10 = (RadioButton) findViewById(id10);
        String radio10 = radioButton10.getText().toString();

        String yes = "はい";

        if (radio1.equals(yes)){
            rg1.check(R.id.radio1n);
        }
        if (radio2.equals(yes)){
            rg2.check(R.id.radio12n);
        }
        if (radio3.equals(yes)){
            rg3.check(R.id.radio3n);
        }
        if (radio4.equals(yes)){
            rg4.check(R.id.radio4n);
        }
        if (radio5.equals(yes)){
            rg5.check(R.id.radio5n);
        }
        if (radio6.equals(yes)){
            rg6.check(R.id.radio6n);
        }
        if (radio7.equals(yes)){
            rg7.check(R.id.radio7n);
        }
        if (radio8.equals(yes)){
            rg8.check(R.id.radio8n);
        }
        if (radio9.equals(yes)){
            rg9.check(R.id.radio9n);
        }
        if (radio10.equals(yes)){
            rg10.check(R.id.radio10n);
        }
    }


}