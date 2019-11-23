package com.example.myapplication.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapplication.R;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);

        final RatingBar ratingBar= (RatingBar)root.findViewById(R.id.ratingBar);
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
        SeekBar seekBar = (SeekBar)root.findViewById(R.id.seekBar);
        final TextView textView= (TextView)root.findViewById(R.id.textView);
        final ImageView imageView = (ImageView)root.findViewById(R.id.imageView);
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
        return root;
    }
}