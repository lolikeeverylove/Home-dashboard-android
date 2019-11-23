package com.example.myapplication.ui.old;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;

import org.w3c.dom.Text;

import java.net.URI;

import static android.net.Uri.parse;
import static java.net.URI.*;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final RatingBar ratingBar= (RatingBar)findViewById(R.id.ratingBar);
        ratingBar.setRating((float) 9.5);
        ratingBar.setMax(8);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating,
                                        boolean fromUser) {
                ratingBar.setRating((float)9.5);
//                Toast.makeText(Main2Activity.this, "рейтинг: " + String.valueOf(rating),
//                        Toast.LENGTH_LONG).show();
            }
        });
        SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar);
        final TextView textView= (TextView)findViewById(R.id.textView);
        final ImageView imageView = (ImageView)findViewById(R.id.imageView);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                switch (progress){
                    case 0: imageView.setImageResource(R.drawable.f0);break;
                    case 1: imageView.setImageResource(R.drawable.f1);break;
                    case 2: imageView.setImageResource(R.drawable.f2);break;
                    case 3: imageView.setImageResource(R.drawable.f3);break;
                    case 4: imageView.setImageResource(R.drawable.f4);break;
                    case 5: imageView.setImageResource(R.drawable.f5);break;
                    case 6: imageView.setImageResource(R.drawable.f6);break;
                    case 7: imageView.setImageResource(R.drawable.f7);break;
                    case 8: imageView.setImageResource(R.drawable.f8);break;
                }
//                Toast.makeText(Main2Activity.this,"number photo: "+progress, Toast.LENGTH_LONG).show();
//                imageView.setImageResource(R.drawable.f1);
//imageView.setImageDrawable(Drawable.createFromPath("home/lolike/AndroidStudioProjects/MyApplication2/app/src/main/res/drawable/f"+progress+".jpg"));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
//                textView.setText("start press");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
//                textView.setText("finish press");
            }
        });

        final float[] dX = new float[1];
        final float[] dY = new float[1];
        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                switch (event.getAction()) {

                    case MotionEvent.ACTION_DOWN:
                        dX[0] = view.getX() - event.getRawX();
                        dY[0] = view.getY() - event.getRawY();
                        break;

                    case MotionEvent.ACTION_MOVE:
                        view.animate()
                                .x(event.getRawX() + dX[0])
                                .y(event.getRawY() + dY[0])
                                .setDuration(0)
                                .start();
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    default:
                        return false;
                }
                return true;
            }
        });
    }
//    public void change(View view){
//        switch (view.getId()){
//            case R.id.
//        }
//    }
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item){
//        return super.onOptionsItemSelected(item);
//    }
}
