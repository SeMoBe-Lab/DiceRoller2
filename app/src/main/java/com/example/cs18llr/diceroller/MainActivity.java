package com.example.cs18llr.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void on_button_click(View view){
        TextView tv = (TextView) this.findViewById(R.id.textView);
        TextView tv2 = (TextView) this.findViewById(R.id.editText2);
        TextView tv3 = (TextView) this.findViewById(R.id.textView2);

        Random r = new Random();

        int number = r.nextInt(7 - 1) + 1;

        tv.setText(Integer.toString(number));


        int one = Integer.valueOf(tv.getText().toString());
        int two = Integer.valueOf(tv2.getText().toString());


      ;

        if ( one == two){

            int three = Integer.valueOf(tv3.getText().toString());
            int plus = three + 1;
            tv3.setText(Integer.toString(plus));

            Toast.makeText(getApplicationContext(),"Congratulations",Toast.LENGTH_SHORT).show();

        }






    }



}
