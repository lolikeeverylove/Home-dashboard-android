package com.example.myapplication.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapplication.R;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11
//        final TextView textView = root.findViewById(R.id.text_dashboard);
        TextView editText = root.findViewById(R.id.textView2);
        editText.setText("Hello i m Natasha, \nI`m pretty girl\nNice to meet you."+
                "I`m not lazy and shy.\n" +
                "I`m very emotional\n" +
                "After work i often upset\n" +
                "Because there my clients\n" +
                "yelling at me\n" +
                "But after work i can\n" +
                "Come to my friends\n " +
                "And being excited to spoke\n" +
                "For my friends as i depressed" +
                "And I become calm.\n" +
                "Actually usually I`m happy at heart\n" +
                "\n" +
                "\n");
//        dashboardViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;







    }

}