package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int flag =0;
    int count = 0;
    String bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        initialbtn();
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetButtons();
            }
        });


    }
    private void initialbtn(){
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        res = findViewById(R.id.resetButton);



    }


    public void Check(View view) {


        Button curr = (Button) view;
        if(curr.getText().toString().equals("")){
        count ++;
        if (flag == 0) {
            curr.setText("X");
            flag++;

        } else {
            curr.setText("O");
            flag--;

        }
        if(count>4) {
            bt1 = b1.getText().toString();
            bt2 = b2.getText().toString();
            bt3 = b3.getText().toString();
            bt4 = b4.getText().toString();
            bt5 = b5.getText().toString();
            bt6 = b6.getText().toString();
            bt7 = b7.getText().toString();
            bt8 = b8.getText().toString();
            bt9 = b9.getText().toString();


            if (bt1.equals(bt2) && bt2.equals(bt3) && !bt1.equals("")) {
                //1
                Toast.makeText(this, "Winner is: " + bt1, Toast.LENGTH_SHORT).show();
                resetButtons();
            } else if (bt4.equals(bt5) && bt5.equals(bt6) && !bt4.equals("")) {
                //2
                Toast.makeText(this, "Winner is: " + bt4, Toast.LENGTH_SHORT).show();
                resetButtons();
            } else if (bt7.equals(bt8) && bt8.equals(bt9) && !bt7.equals("")) {
                //3
                Toast.makeText(this, "Winner is: " + bt7, Toast.LENGTH_SHORT).show();
                resetButtons();
            } else if (bt1.equals(bt5) && bt5.equals(bt9) && !bt1.equals("")) {
                //4
                Toast.makeText(this, "Winner is: " + bt1, Toast.LENGTH_SHORT).show();
                resetButtons();
            } else if (bt1.equals(bt4) && bt4.equals(bt7) && !bt1.equals("")) {
                //5
                Toast.makeText(this, "Winner is: " + bt4, Toast.LENGTH_SHORT).show();
                resetButtons();
            } else if (bt2.equals(bt5) && bt5.equals(bt8) && !bt2.equals("")) {
                //6
                Toast.makeText(this, "Winner is: " + bt2, Toast.LENGTH_SHORT).show();
                resetButtons();
            } else if (bt3.equals(bt5) && bt5.equals(bt7) && !bt3.equals("")) {
                Toast.makeText(this, "Winner is: " + bt3, Toast.LENGTH_SHORT).show();
                resetButtons();
                //7
            } else if (bt3.equals(bt6) && bt6.equals(bt9) && !bt3.equals("")) {
                Toast.makeText(this, "Winner is: " + bt6, Toast.LENGTH_SHORT).show();
                resetButtons();
                //8
            } else if (bt3.equals(bt2) && bt2.equals(bt1) && !bt1.equals("")) {
                Toast.makeText(this, "Winner is: " + bt1, Toast.LENGTH_SHORT).show();
                resetButtons();

            }



        }
        }


    }

    private void resetButtons() {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        flag = 0;
        count = 0;

    }


}