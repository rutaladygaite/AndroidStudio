package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;


public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView) findViewById (R.id.Welcome);
        btn = (Button) findViewById (R.id.button);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txt.setText("Button Clicked");
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMain22Activity();
            }
        });
    }

    public void browser1(View view){
        Intent browserIntent = new Intent (Intent.ACTION_VIEW,Uri.parse("http://google.com"));
        startActivity(browserIntent);
    }

    public void openMain22Activity(){
        Intent intent = new Intent(this,Activity4.class);
        startActivity(intent);
    }

}
