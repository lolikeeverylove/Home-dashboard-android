package com.example.myapplication.ui.old;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.myapplication.R;

public class activity1 extends Activity {
    private TextView editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

//        editText = (TextView)findViewById(R.id.textView2);
//        editText.setText("Hello i m Natasha, \nI`m pretty girl\nNice to meet you." +
//                "I`m not lazy and shy.\n" +
//                "I`m very emotional\n" +
//                "After work i often upset\n" +
//                "Because there my clients\n" +
//                "yelling at me\n" +
//                "But after work i can\n" +
//                "Come to my friends\n " +
//                "And being excited to spoke\n" +
//                "For my friends as i depressed" +
//                "And I become calm.\n" +
//                "Actually usually I`m happy at heart\n" +
//                "\n" +
//                "\n");
//        Button button =(Button)findViewById(R.id.button);
//        button.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        openActivity2(); }});
    }

    void openActivity2(){
        Intent intent=new Intent(this , Main2Activity.class);
        startActivity(intent); }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item){
//        return super.onOptionsItemSelected(item);
//    }


}
