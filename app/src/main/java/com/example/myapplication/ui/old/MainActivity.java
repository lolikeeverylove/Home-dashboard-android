package com.example.myapplication.ui.old;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
    private Button button1,button;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button);
        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        openActivity2();
                    }
                }
        );
    }
    void openActivity2(){
        Intent intent=new Intent(this , activity1.class);
        startActivity(intent);
    }
}

